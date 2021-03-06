package com.smartnews.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by xelamanster on 13.08.2015.
 */
@Entity
@Table(name="article")
@NamedQueries({@NamedQuery(name = Article.FIND_ALL, query = "select f from Article f")})
public class Article implements ModelEntity {
    public static final String FIND_ALL = "Article.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq_gen")
    @SequenceGenerator(name = "article_seq_gen", sequenceName = "article_seq", allocationSize=1)
    private long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "folder_fk")
    private Folder folder;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "article_tag",
            joinColumns = {
                    @JoinColumn(name = "article_fk", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "tag_fk", referencedColumnName = "id")
            }
    )
    private List<Tag> tags;

    private String url;
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
