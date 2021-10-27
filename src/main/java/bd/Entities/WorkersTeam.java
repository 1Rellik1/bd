package bd.Entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="workers_team")
public class WorkersTeam {
    @Id
    @Column(name="wrokers_team_id")
    private int wrokers_team_id;

    @MapsId("project_name")
    @OneToOne
    @JoinColumn(name = "project_name")
    @NotNull
    private Company project_name;

    @Column(name = "backend_developer_id")
    private int backend_developer_id;

    @Column(name = "frontend_developer_id")
    private int frontend_developer_id;

    @Column(name = "pm_id")
    private int pm_id;

    public int getWrokers_team_id() {
        return wrokers_team_id;
    }

    public Company getProject_name() {
        return project_name;
    }

    public int getBackend_developer_id() {
        return backend_developer_id;
    }

    public int getFrontend_developer_id() {
        return frontend_developer_id;
    }

    public int getPm_id() {
        return pm_id;
    }

    public void setWrokers_team_id(int wrokers_team_id) {
        this.wrokers_team_id = wrokers_team_id;
    }

    public void setProject_name(Company project_name) {
        this.project_name = project_name;
    }

    public void setBackend_developer_id(int backend_developer_id) {
        this.backend_developer_id = backend_developer_id;
    }

    public void setFrontend_developer_id(int frontend_developer_id) {
        this.frontend_developer_id = frontend_developer_id;
    }

    public void setPm_id(int pm_id) {
        this.pm_id = pm_id;
    }
}
