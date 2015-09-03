package com.smartnews.rest.dto;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public class ArticleDto extends NamedDto {
  private final List<TagDto> tags;
  private final String url;
  private final String description;

  private ArticleDto(Builder builder) {
    super(builder.id, builder.name);
    this.tags = builder.tags;
    this.url = builder.url;
    this.description = builder.description;
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

  public static Builder newBuilder(long id, String name) {
    return new ArticleDto.Builder(id, name);
  }

  public static class Builder {
    private final long id;
    private final String name;
    private List<TagDto> tags;
    private String url;
    private String description;

    private Builder(long id, String name) {
      this.id = id;
      this.name = name;
    }

    public Builder tags(List<TagDto> tags) {
      this.tags = tags;
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public ArticleDto build() {
      return new ArticleDto(this);
    }
  }
}
