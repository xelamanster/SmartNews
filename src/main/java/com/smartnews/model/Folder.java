package com.smartnews.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by fein on 8/11/2015.
 */
@Entity
@Table(name="folder")
@NamedQueries({@NamedQuery(name = Folder.FIND_ALL, query = "select f from Folder f")})
public class Folder {
    public static final String FIND_ALL = "Folder.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "folder_seq_gen")
    @SequenceGenerator(name = "folder_seq_gen", sequenceName = "folder_seq", allocationSize=1)
    private long id;
    @ManyToOne
    @JoinColumn(name = "parent_fk")
    private Folder parentFolder;
    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    @JoinColumn(name="folder_fk", referencedColumnName="id")
    private List<Article> articles;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Folder getParentFolder() {
        return parentFolder;
    }

    public void setParentFolder(Folder parentFolder) {
        this.parentFolder = parentFolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
