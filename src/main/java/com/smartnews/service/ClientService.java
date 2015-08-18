package com.smartnews.service;

import com.smartnews.model.Client;

import java.util.List;

/**
 * Created by fein on 8/13/2015.
 */
public interface ClientService {
    Client findClient(long clientId);

    List<Client> findAllClients();
}
