package com.smartnews.rest.mappers;

import com.smartnews.model.Article;
import com.smartnews.rest.dto.ArticleDto;

import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
public class ArticleMapper implements RestMapper<ArticleDto, Article> {

    @Override
    public ArticleDto mapToDto(Article entity) {
        return null;
    }

    @Override
    public List<ArticleDto> mapToDtos(List<Article> entities) {
        return null;
    }

    @Override
    public Article mapToEntity(ArticleDto dto) {
        return null;
    }

    @Override
    public List<Article> mapToEntities(List<ArticleDto> dtos) {
        return null;
    }
}
