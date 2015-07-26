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
        startOperation();
        session.save(client);
        tx.commit();
    }

    @Override
    public Client findById(long id) {
        startOperation();
        Client client = session.get(Client.class, id);
        tx.commit();
        return client;
    }

    @Override
    public void update(Client client) {
        startOperation();
        session.update(client);
        tx.commit();
    }

    @Override
    public List<Client> list() {
        startOperation();
        List<Client> result = session.getNamedQuery(Client.FIND_ALL).list();
        tx.commit();
        return result;
    }

    @Override
    public void delete(Client client) {
        startOperation();
        session.delete(client);
        tx.commit();
    }
}
