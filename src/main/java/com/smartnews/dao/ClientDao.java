package com.smartnews.dao;

import com.smartnews.model.Client;

import java.util.List;

/**
 * Created by fein on 7/22/2015.
 */
public interface ClientDao {
    public void save(Client client);

    public List<Client> list();
}
