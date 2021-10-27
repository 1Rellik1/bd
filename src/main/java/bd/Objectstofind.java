package bd;

import bd.Entities.Company;

import javax.persistence.Column;
import java.util.Date;

public class Objectstofind {
    private String project_name;
    private String trs_link;
    private Date deadline;
    private int cost_of_an_order;

    public String getProject_name() {
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

    public void setProject_name(String project_name) {
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
