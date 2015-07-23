package com.smartnews.dao;

import com.smartnews.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

/**
 * Created by fein on 7/22/2015.
 */
@Repository
public class ClientDaoImpl implements ClientDao {

    private SessionFactory sessionFactory;

    @Autowired
    public ClientDaoImpl(EntityManagerFactory factory) {
        if(factory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("factory is not a hibernate factory");
        }
        sessionFactory = factory.unwrap(SessionFactory.class);
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
