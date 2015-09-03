package com.smartnews.rest.mapper;

import com.google.common.collect.Lists;
import com.smartnews.model.Article;
import com.smartnews.rest.dto.ArticleDto;
import com.smartnews.rest.dto.TagDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArticleMapper implements RestMapper<ArticleDto, Article> {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public ArticleDto mapToDto(Article article) {
        List<TagDto> tagDtos = Lists.newArrayList(tagMapper.mapToDtos(article.getTags()));

        return ArticleDto.newBuilder(article.getId(), article.getName())
                .url(article.getUrl())
                .description(article.getDescription())
                .tags(tagDtos)
                .build();
    }

    @Override
    public List<ArticleDto> mapToDtos(List<Article> articles) {
        List<ArticleDto> articleDtos = Lists.newArrayList();
        for (Article article : articles) {
            articleDtos.add(mapToDto(article));
        }
        return articleDtos;
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
