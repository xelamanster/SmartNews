package com.smartnews.dao;

import com.smartnews.model.Client;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
* Created by fein on 7/23/2015.
*/
public class ClientDaoTest extends AbstractClientDaoTest {

    private static final String TEST_CLIENT_INSERT_GET =  "testInsertAndGetClient";
    private static final String TEST_UPDATE_CLIENT = "testUpdateClient";
    private static final String TEST_UPDATE_CLIENT_MODIFIED = "testUpdateClient modified";
    private static final String TEST_DELETE_CLIENT = "testDeleteClient";

    //insert-get
    @Test
    public void testInsertAndGetClient() {
        Client testClient = new Client(TEST_CLIENT_INSERT_GET);
        clientDao.save(testClient);

        long testClientId = testClient.getId();
        Client dbTestClient = clientDao.findById(testClientId);

        assertEquals("client was inserted incorrectly", testClient, dbTestClient);
    }

    //insert-update-get
    @Test
    public void testUpdateClient() {
        Client testClient = new Client(TEST_UPDATE_CLIENT);
        clientDao.save(testClient);

        testClient.setName(TEST_UPDATE_CLIENT_MODIFIED);
        clientDao.update(testClient);

        Client dbTestClient = clientDao.findById(testClient.getId());

        assertEquals("client wasn't updated ", dbTestClient.getName(), TEST_UPDATE_CLIENT_MODIFIED);
    }

    //insert-delete-get
    @Test
    public void testDeleteClient() {
        Client testClient = new Client(TEST_DELETE_CLIENT);
        clientDao.save(testClient);

        assertNotNull("client wasn't inserted ", clientDao.findById(testClient.getId()));

        clientDao.delete(testClient);

        assertNull("client wasn't deleted ", clientDao.findById(testClient.getId()));
    }

}
