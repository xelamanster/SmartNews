package com.smartnews.rest;

import com.smartnews.rest.dto.ArticleDto;
import com.smartnews.rest.exception.ResourceNotFoundException;
import com.smartnews.service.ArticlesService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by fein on 8/13/2015.
 */
@RestController
@RequestMapping
public class ArticlesServiceController {

    private static final Logger LOG = LogManager.getLogger(ArticlesServiceController.class.getName());

    private static final int MIN_PAGE_NUMBER = 1;
    private static final int MIN_PAGE_SIZE = 2;
    private static final String WRONG_PAGING_PARAMETERS = "Wrong paging parameters: page = %d and size = %d";

    @Autowired
    private ArticlesService articlesService;

    @RequestMapping(value = "/articles", method = RequestMethod.GET)
    public List<ArticleDto> findPaginatedArticles(@RequestParam("page") int page, @RequestParam("size") int size) {
        if (page < MIN_PAGE_NUMBER || size < MIN_PAGE_SIZE) {
            String errorMessage = String.format(WRONG_PAGING_PARAMETERS, page, size);
            LOG.warn(errorMessage);
            throw new ResourceNotFoundException(errorMessage);
        }
        return articlesService.findPaginatedArticles(page, size);
    }
}
