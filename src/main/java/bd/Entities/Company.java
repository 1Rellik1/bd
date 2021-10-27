package bd.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table (name="company")
public class Company {
    @Id
    @Column(name="project_name")
    @NotNull
    private String project_name;

    @Column(name="workers_team_id")
    @NotNull
    private int workers_team_id;

    @Column(name="order_number")
    @NotNull
    private int order_number;

    @Column(name="client_id")
    @NotNull
    private int client_id;

    public String getProjectname() {
        return project_name;
    }

    public int getWorkers_team_id() {
        return workers_team_id;
    }

    public int getOrder_number() {
        return order_number;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setProjectname(String projectname) {
        this.project_name = projectname;
    }

    public void setWorkers_team_id(int workers_team_id) {
        this.workers_team_id = workers_team_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
}
