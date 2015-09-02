package com.smartnews.rest.mapper;

import com.smartnews.model.Article;
import com.smartnews.rest.dto.ArticleDto;
import com.smartnews.rest.dto.TagDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fein on 8/27/2015.
 */
@Component
public class ArticleMapper implements RestMapper<ArticleDto, Article> {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public ArticleDto mapToDto(Article article) {
        List<TagDto> tagDtos = new ArrayList<TagDto>();
        tagDtos.addAll(tagMapper.mapToDtos(article.getTags()));
        ArticleDto articleDto = ArticleDto.newBuilder()
                .setId(article.getId()).setName(article.getName()).setUrl(article.getUrl())
                .setDescription(article.getDescription()).setTags(tagDtos).build();
        return articleDto;
    }

    @Override
    public List<ArticleDto> mapToDtos(List<Article> articles) {
        List<ArticleDto> articleDtos = new ArrayList<ArticleDto>();
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
