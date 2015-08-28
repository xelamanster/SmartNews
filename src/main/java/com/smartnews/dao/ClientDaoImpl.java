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
public class ClientDaoImpl extends AbstractDao implements ClientDao {

    @Override
    public void save(Client client) {
        getSession().save(client);
    }

    @Override
    public Client findById(long id) {
        Client client = (Client) getSession().get(Client.class, id);
        return client;
    }

    @Override
    public void update(Client client) {
        getSession().update(client);
    }

    @Override
    public List<Client> list() {
        List<Client> result = getSession().getNamedQuery(Client.FIND_ALL).list();
        return result;
    }

    @Override
    public void delete(Client client) {
        getSession().delete(client);
    }
}
