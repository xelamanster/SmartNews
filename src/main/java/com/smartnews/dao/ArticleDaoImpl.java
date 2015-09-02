package com.smartnews.dao;

import com.smartnews.model.Article;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by fein on 8/30/2015.
 */
@Repository
public class ArticleDaoImpl extends AbstractDao implements ArticleDao  {

    public List<Article> findPaginatedArticles(int start, int limit) {
        Query query = getSession().getNamedQuery(Article.FIND_ALL);
        query.setFirstResult(start);
        query.setMaxResults(limit);
        return query.list();
    }
}
