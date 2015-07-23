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
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Client> list() {
        return getSession().getNamedQuery(Client.FIND_ALL).list();
    }

    private Session getSession() {
        return sessionFactory.openSession();
    }
}
