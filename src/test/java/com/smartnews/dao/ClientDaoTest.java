package com.smartnews.dao;

import com.smartnews.model.Client;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
* Created by fein on 7/23/2015.
*/
public class ClientDaoTest extends AbstractClientDaoTest {

    @Test
    public void testFindByName() {

        List<Client> clients = clientDao.list();
        assertNotNull(clients.get(0));
    }
}
