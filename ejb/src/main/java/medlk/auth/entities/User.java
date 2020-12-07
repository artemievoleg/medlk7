package medlk.auth.entities;

import medlk.med.entities.Client;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "isadmin")
    private boolean isAdmin;

    @ManyToOne
    private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    private Credentials credentials;

    @Column(name = "isclient")
    private boolean isClient;

    @OneToOne(cascade = CascadeType.ALL)
    private Client client;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

}
