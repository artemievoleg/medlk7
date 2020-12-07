package medlk.auth.ejb;


import medlk.auth.entities.Role;
import medlk.exceptions.ExceptionList;
import medlk.exceptions.InternalException;
import medlk.auth.entities.Credentials;
import medlk.auth.entities.User;
import medlk.utils.HashManager;
import medlk.utils.regex.PatternList;
import medlk.utils.regex.RegexManager;
import org.apache.commons.lang3.StringUtils;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class AuthManager {

    @PersistenceContext(unitName = "medlkPU")
    private EntityManager entityManager;

    public User login(String email, String password) throws InternalException {
        if(StringUtils.isEmpty(email) || StringUtils.isEmpty(password)){
            throw new InternalException(ExceptionList.E101);
        }

        Credentials credentials = entityManager.find(Credentials.class, email);

        if (credentials == null){
            throw new InternalException(ExceptionList.E102);
        }

        if(!HashManager.checkHash(password, credentials.getPassHash())){
            throw new InternalException(ExceptionList.E103);
        }

        User user = credentials.getUser();
        if(user == null){
            throw new InternalException(ExceptionList.E104);
        }

        return user;

    }

    public User createNewUser(String userName, String email, String password, boolean isAdmin, Role role){
        User user = new User();

        Credentials credentials = new Credentials();
        credentials.setEmail(email);
        credentials.setPassHash(HashManager.getHash(password));
        credentials.setUser(user);

        user.setCredentials(credentials);
        user.setUserName(userName);
        user.setAdmin(isAdmin);
        user.setRole(role);

        entityManager.persist(credentials);
        entityManager.persist(user);

        return user;
    }

    public User registry(String userName, String email, String password, boolean isAdmin, Role role) throws InternalException {
        if(StringUtils.isEmpty(email) || StringUtils.isEmpty(password)){
            throw new InternalException(ExceptionList.E150);
        }
        Credentials credentials = entityManager.find(Credentials.class, email);
        if (credentials != null){
            throw new InternalException(ExceptionList.E151);
        }

        if(!RegexManager.matches(email, PatternList.EMAIL)){
            throw new InternalException(ExceptionList.E152);
        }

        if(!RegexManager.matches(password, PatternList.PASS)){
            throw new InternalException(ExceptionList.E153);
        }

        User user = createNewUser(userName, email, password, isAdmin, role);
        if(user == null){
            throw new InternalException(ExceptionList.E154);
        }

        return user;

    }

}
