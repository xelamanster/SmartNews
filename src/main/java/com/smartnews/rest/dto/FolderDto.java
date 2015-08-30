package com.smartnews.rest.dto;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public class FolderDto extends NamedDto {

    private final FolderDto parentFolder;
    private final List<ArticleDto> articles;

    public FolderDto(long id, String name, FolderDto parentFolder, List<ArticleDto> articles) {
        super(id, name);
        this.parentFolder = parentFolder;
        this.articles = articles;
    }

    public FolderDto getParentFolder() {
        return parentFolder;
    }

    public List<ArticleDto> getArticles() {
        return articles;
    }
}
