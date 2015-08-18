package com.smartnews.service;

import com.smartnews.dao.ClientDao;
import com.smartnews.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by fein on 8/13/2015.
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public Client findClient(long clientId) {
        return clientDao.findById(clientId);
    }

    @Override
    public List<Client> findAllClients() {
        return clientDao.list();
    }
}
