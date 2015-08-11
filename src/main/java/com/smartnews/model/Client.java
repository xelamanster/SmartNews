package com.smartnews.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by fein on 7/22/2015.
 */
@Entity
@Table(name="client")
@NamedQueries({@NamedQuery(name = Client.FIND_ALL, query = "select c from Client c")})
public class Client {
    public static final String FIND_ALL = "Client.findAll";

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq_gen")
    @SequenceGenerator(name = "client_seq_gen", sequenceName = "client_seq", allocationSize=1)
    private long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name="client_fk", referencedColumnName="id")
    private List<Folder> folders;

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

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (id != client.id) return false;
        if (name != null ? !name.equals(client.name) : client.name != null) return false;

        return true;
    }
}
