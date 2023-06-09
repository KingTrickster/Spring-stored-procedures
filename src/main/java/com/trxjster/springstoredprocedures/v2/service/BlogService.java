package com.trxjster.springstoredprocedures.v2.service;

import com.trxjster.springstoredprocedures.v2.repository.BlogRepository;
import org.springframework.stereotype.Service;

@Service("BlogServiceV2")
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public int getTotalBlogsByTitle(String title) {
        return blogRepository.getTotalBlogsByTitle(title);
    }

    public int getTotalBlogsByTitleProcedureName(String title) {
        return blogRepository.getTotalBlogsByTitleProcedureName(title);
    }

    public int getTotalBlogsByTitleValue(String title) {
        return blogRepository.getTotalBlogsByTitleValue(title);
    }

    public int getTotalBlogsByTitleExplicit(String title) {
        return blogRepository.GET_TOTAL_BLOGS_BY_TITLE(title);
    }

    public int getTotalBlogsByTitleEntity(String title) {
        return blogRepository.getTotalBlogsByTitleEntiy(title);
    }
}