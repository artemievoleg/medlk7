package medlk.med.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

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

    @Column(name = "birthdate")
    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "client")
    private List<Appointment> appointments;

}
