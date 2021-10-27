package bd.Entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="`order`")
public class Order {
    @Id
    @Column(name="order_number")
    private int order_number;

    @MapsId("project_name")
    @OneToOne
    @JoinColumn(name = "project_name")
    @NotNull
    private Company project_name;

    @Column(name = "trs_link")
    private String trs_link;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "cost_of_an_order")
    private int cost_of_an_order;

    public int getOrder_number() {
        return order_number;
    }

    public Company getProject_name() {
        return project_name;
    }

    public String getTrs_link() {
        return trs_link;
    }

    public Date getDeadline() {
        return deadline;
    }

    public int getCost_of_an_order() {
        return cost_of_an_order;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }

    public void setProject_name(Company project_name) {
        this.project_name = project_name;
    }

    public void setTrs_link(String trs_link) {
        this.trs_link = trs_link;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void setCost_of_an_order(int cost_of_an_order) {
        this.cost_of_an_order = cost_of_an_order;
    }
}
