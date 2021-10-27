package bd.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name="frontend_developer")
public class FrontenDdeveloper {
    @Id
    @Column(name="frontend_developer_id")
    private int frontend_developer_id;

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
