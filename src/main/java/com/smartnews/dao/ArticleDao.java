package com.smartnews.dao;

import com.smartnews.model.Article;

import java.util.List;

/**
 * Created by fein on 8/30/2015.
 */
public interface ArticleDao {
    public List<Article> findPaginatedArticles(int start, int limit);

}
