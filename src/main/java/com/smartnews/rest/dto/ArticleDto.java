package com.smartnews.rest.dto;

import com.smartnews.model.Tag;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public class ArticleDto extends NamedDto {
    private final List<TagDto> tags;
    private final String url;
    private final String description;

    public ArticleDto(long id, String name, List<TagDto> tags, String url, String description) {
        super(id, name);
        this.tags = tags;
        this.url = url;
        this.description = description;
    }

    public List<TagDto> getTags() {
        return tags;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public static Builder newBuilder() {
        return new ArticleDto.Builder();
    }

    public static class Builder {
        private long nestedId;
        private String nestedName;
        private List<TagDto> nestedTags;
        private String nestedUrl;
        private String nestedDescription;

        private Builder() {
        }

        public Builder setId(long id) {
            this.nestedId = id;
            return this;
        }

        public Builder setName(String name) {
            this.nestedName = name;
            return this;
        }

        public Builder setTags(List<TagDto> tags) {
            this.nestedTags = tags;
            return this;
        }

        public Builder setUrl(String url) {
            this.nestedUrl = url;
            return this;
        }

        public Builder setDescription(String description) {
            this.nestedDescription = description;
            return this;
        }

        public ArticleDto build() {
            return new ArticleDto(nestedId, nestedName, nestedTags, nestedUrl, nestedDescription);
        }
    }
}
