package com.smartnews.dao;

import com.smartnews.model.Client;
import sun.misc.Cleaner;

import java.util.List;

/**
 * Created by fein on 7/22/2015.
 */
public interface ClientDao {
    public void save(Client client);

    public List<Client> list();

    public void delete(Client client);

    public Client findById(long id);

    public void update(Client client);
}
