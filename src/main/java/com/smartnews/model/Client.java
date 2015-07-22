package com.smartnews.model;

import javax.persistence.*;

/**
 * Created by fein on 7/22/2015.
 */
@Entity
@Table(name="client")
@NamedQueries({@NamedQuery(name = Client.FIND_ALL, query = "select c from Client c")})
public class Client {
    public static final String FIND_ALL = "Client.findAll";

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
