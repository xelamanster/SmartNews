package com.smartnews.dao;

import com.smartnews.model.Client;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
* Created by fein on 7/23/2015.
*/
public class ClientDaoTest extends AbstractClientDaoTest {

    @Test
    public void testClientsAreNotNull() {
        List<Client> clients = clientDao.list();
        assert(clients.size() > 0);
    }

    @Test
    @Ignore
    public void testInsertClient() {
        Client client = new Client("test");
        clientDao.save(client);
    }
}
