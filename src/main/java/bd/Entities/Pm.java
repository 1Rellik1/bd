package bd.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="pm")
public class Pm {
    @Id
    @Column(name="pm_id")
    private int pm_id;

    @MapsId("project_name")
    @OneToOne
    @JoinColumn(name = "project_name")
    @NotNull
    private Company project_name;

    @MapsId("wrokers_team_id")
    @OneToOne
    @JoinColumn(name = "wrokers_team_id")
    @NotNull
    private WorkersTeam wrokers_team_id;

    @Column(name = "full_name")
    private String full_name;

    @Column(name = "speciality")
    private String speciality;

    @Column(name = "e_mail")
    private String e_mail;
}
