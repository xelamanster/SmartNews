package com.smartnews.service;

import com.smartnews.rest.dto.ArticleDto;

import java.util.List;

/**
 * Created by fein on 8/30/2015.
 */
public interface ArticlesService {
    public List<ArticleDto> findPaginatedArticles(int page, int size);
}
