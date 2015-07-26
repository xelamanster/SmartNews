package com.smartnews.dao;

import com.smartnews.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fein on 7/22/2015.
 */
@Repository
public class ClientDaoImpl implements ClientDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Client client) {
        Session session = getSession();
        session.getTransaction().begin();
        session.save(client);
        session.getTransaction().commit();
    }

    @Override
    public List<Client> list() {
        Session session = getSession();
        session.getTransaction().begin();
        List<Client> result = session.getNamedQuery(Client.FIND_ALL).list();
        session.getTransaction().commit();
        return result;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
