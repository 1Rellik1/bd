package bd.Services;


import bd.Entities.Company;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
public class CompanyService {
    @Autowired
    private final SessionFactory sessionFactory;

    public CompanyService (SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public void addCompany(Company company) {
        session.beginTransaction();
        session.saveOrUpdate(company);
        session.getTransaction().commit();
    }

    public List<Company> getCompanies() {
        List<Company> ventil=session.createQuery("select mn from Company mn", Company.class).list();
        return ventil;
    }



}
