package medlk.med.entities;

import medlk.auth.entities.Role;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    @Column(name = "appoint_date")
    private LocalDate appointmentDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "appoint_time")
    private TimeMappings30M appointmentTime;

}
