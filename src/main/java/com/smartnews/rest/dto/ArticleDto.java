package com.smartnews.rest.dto;

import com.smartnews.model.Tag;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public class ArticleDto extends NamedDto {
    private List<Tag> tags;
    private String url;
    private String description;

    public ArticleDto(long id, String name) {
        super(id, name);
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
}
