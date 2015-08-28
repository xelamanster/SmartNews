package com.smartnews.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by xelamanster on 13.08.2015.
 */
@Entity
@Table(name="tag")
@NamedQueries({@NamedQuery(name = Tag.FIND_ALL, query = "select f from Tag f")})
public class Tag implements ModelEntity {
    public static final String FIND_ALL = "Tag.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tag_seq_gen")
    @SequenceGenerator(name = "tag_seq_gen", sequenceName = "tag_seq", allocationSize=1)
    private long id;

    @ManyToMany(mappedBy = "tags")
    private List<Article> articles;

    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
