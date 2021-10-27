package bd.Services;

import bd.Entities.Company;
import bd.Entities.Order;
import bd.Objectstofind;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    private final SessionFactory sessionFactory;

    public OrderService (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;
    private CriteriaBuilder builder;
    private CriteriaQuery<Company> timeCriteriaQuery;
    private Root<Company> root;
    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
        builder = session.getCriteriaBuilder();
        timeCriteriaQuery = builder.createQuery(Company.class);
        root = timeCriteriaQuery.from(Company.class);
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public String addOrder(Objectstofind objectstofind) {
        List<Company> ventil=session.createQuery(timeCriteriaQuery.select(root).where(builder.equal(root.get("project_name"), objectstofind.getProject_name()))).list();
        if(ventil.size()==0)
            return "Проект с таким именем не найден";
        int order_number=ventil.get(0).getOrder_number();
        Order order= new Order();
        order.setOrder_number(order_number);
        order.setCost_of_an_order(objectstofind.getCost_of_an_order());
        order.setProject_name(ventil.get(0));
        order.setDeadline(objectstofind.getDeadline());
        order.setTrs_link(objectstofind.getTrs_link());
        session.beginTransaction();
        session.saveOrUpdate(order);
        session.getTransaction().commit();
        return "Информация о заказе добавлен";
    }

    public List<Order> getOrders() {
        List<Order> ventil=session.createQuery("select mn from Order mn", Order.class).list();
        return ventil;
    }
}
