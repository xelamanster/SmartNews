package com.smartnews.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.hibernate.Transaction;

/**
 * Created by fein on 7/26/2015.
 */
public abstract class AbstractDao {
    @Autowired
    private SessionFactory sessionFactory;

    protected Session session;
    protected Transaction tx;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    protected void startOperation() {
        session = getSession();
        tx = session.beginTransaction();
    }
}
