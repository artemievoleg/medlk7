package medlk.auth;


import medlk.exceptions.InternalException;
import medlk.auth.ejb.AuthManager;
import medlk.auth.entities.Role;
import medlk.auth.entities.User;
import medlk.utils.URIList;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;

@Named
@SessionScoped
public class AuthBean implements Serializable {
    private Role role;
    private String userName;
    private String email;
    private String password;
    private boolean isAdmin;

    @EJB
    private AuthManager authManager;

    @Inject
    private HttpServletRequest request;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void doLogin(){
        User user = null;
        try {
            user = authManager.login(email, password);
        } catch (InternalException e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance()
                    .addMessage("globalmessages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error ".concat(e.getError().code.toString()),e.getError().description));
        }

        if(user != null){
            try {
                if(user.isAdmin()){
                    FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect(URIList.DEFAULT_URL_PREFIX.url.concat(URIList.DEFAULT_ADMIN_URL_SUFFIX.url));
                }else{
                    FacesContext.getCurrentInstance()
                            .getExternalContext()
                            .redirect(URIList.DEFAULT_URL_PREFIX.url.concat(URIList.DEFAULT_USER_URL_SUFFIX.url));
                }
            } catch (IOException e) {
                e.printStackTrace();
                FacesContext.getCurrentInstance()
                        .addMessage("globalmessages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "UNKNOWN ERROR",e.getMessage()));
            }
        }
    }

    public void doRegistry(){
        User user = null;
        try {
            //Default(minimal) Role = null
            user = authManager.registry(userName, email, password, isAdmin,null);
        } catch (InternalException e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage("globalmessages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error ".concat(e.getError().code.toString()),e.getError().description));
        }
        if(user != null) {
            FacesContext.getCurrentInstance().addMessage("globalmessages", new FacesMessage(FacesMessage.SEVERITY_INFO, "Registration status.", "User ".concat(getUserName()).concat(" registration was successful.")));
        }
    }

    public void doLogout(){
        request.getSession().invalidate();
        try {
            FacesContext.getCurrentInstance()
                    .getExternalContext()
                    .redirect(URIList.DEFAULT_URL_PREFIX.url.concat(URIList.DEFAULT_URL_SUFFIX.url));
        } catch (IOException e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance()
                    .addMessage("globalmessages", new FacesMessage(FacesMessage.SEVERITY_ERROR, "UNKNOWN ERROR",e.getMessage()));
        }
    }

}
