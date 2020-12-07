package medlk.med.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "firstname")
    private String firstName;   //имя
    @Column(name = "lastname")
    private String lastName;    //фамилия
    @Column(name = "middlename")
    private String middleName;  //отчество

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "doctor")
    private List<Appointment> appointments;


}
