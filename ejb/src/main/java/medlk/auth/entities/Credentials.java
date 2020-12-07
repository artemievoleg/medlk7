package medlk.auth.entities;

import javax.persistence.*;


@Entity
@Table(name = "credentials")
public class Credentials {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "passhash")
    private String passHash;

    @OneToOne(mappedBy = "credentials")
    private User user;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassHash() {
        return passHash;
    }

    public void setPassHash(String passHash) {
        this.passHash = passHash;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
