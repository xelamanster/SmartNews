package com.smartnews.service;

import com.smartnews.dao.ArticleDao;
import com.smartnews.rest.dto.ArticleDto;
import com.smartnews.rest.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by fein on 8/30/2015.
 */
@Service
public class ArticlesServiceImpl implements ArticlesService {

    @Autowired
    private ArticleDao articleDao;
    @Autowired
    private ArticleMapper articleMapper;

    @Transactional
    public List<ArticleDto> findPaginatedArticles(int page, int size) {
        int start = (page - 1) * size;
        return articleMapper.mapToDtos(articleDao.findPaginatedArticles(start, size));
    }
}
