package bd.Entities;


import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name="client_id")
    private int client_id;

    @MapsId("project_name")
    @OneToOne
    @JoinColumn(name = "project_name")
    @NotNull
    private Company project_name;

    @Column(name = "full_name")
    private String full_name;


    @Column(name = "telephone_number")
    private int telephone_number;

    @Column(name = "e_mail")
    private String e_mail;

    public int getClient_id() {
        return client_id;
    }

    public Company getProject_name() {
        return project_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public int getTelephone_number() {
        return telephone_number;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setProject_name(Company project_name) {
        this.project_name = project_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setTelephone_number(int telephone_number) {
        this.telephone_number = telephone_number;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
