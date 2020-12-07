package medlk.auth.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "rolename")
    private String roleName;

    @Column(name = "clientui")
    private boolean allowClientUI;

    @Column(name = "usermodui")
    private boolean allowUserModUI;

    @Column(name = "docmodui")
    private boolean allowDocModUI;

    @Column(name = "schedulemodui")
    private boolean allowScheduleModUI;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isAllowClientUI() {
        return allowClientUI;
    }

    public void setAllowClientUI(boolean allowClientUI) {
        this.allowClientUI = allowClientUI;
    }

    public boolean isAllowUserModUI() {
        return allowUserModUI;
    }

    public void setAllowUserModUI(boolean allowUserModUI) {
        this.allowUserModUI = allowUserModUI;
    }

    public boolean isAllowDocModUI() {
        return allowDocModUI;
    }

    public void setAllowDocModUI(boolean allowDocModUI) {
        this.allowDocModUI = allowDocModUI;
    }

    public boolean isAllowScheduleModUI() {
        return allowScheduleModUI;
    }

    public void setAllowScheduleModUI(boolean allowScheduleModUI) {
        this.allowScheduleModUI = allowScheduleModUI;
    }
}
