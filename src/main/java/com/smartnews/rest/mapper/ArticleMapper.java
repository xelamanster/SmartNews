package com.smartnews.rest.mapper;

import com.smartnews.model.Article;
import com.smartnews.rest.dto.ArticleDto;
import com.smartnews.rest.dto.TagDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by fein on 8/27/2015.
 */
@Component
public class ArticleMapper implements RestMapper<ArticleDto, Article> {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public ArticleDto mapToDto(Article article) {
        return ArticleDto.newBuilder()
                .setId(article.getId())
                .setName(article.getName())
                .setUrl(article.getUrl())
                .setDescription(article.getDescription())
                .setTags(tagMapper.mapToDtos(article.getTags()))
                .build();
    }

    @Override
    public List<ArticleDto> mapToDtos(List<Article> articles) {
        return articles.stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
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
