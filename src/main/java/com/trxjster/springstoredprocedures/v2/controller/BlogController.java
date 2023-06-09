package com.trxjster.springstoredprocedures.v2.controller;

import com.trxjster.springstoredprocedures.v2.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("BlogControllerV2")
@RequestMapping("/api/v2")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping(path = "/titleCount")
    public long getTotalBlogsByTitle(@RequestParam("title") String title) {
        return blogService.getTotalBlogsByTitle(title);
    }

    @GetMapping(path = "/titleCountP")
    public long getTotalBlogsByTitleProcedureName(@RequestParam("title") String title) {
        return blogService.getTotalBlogsByTitleProcedureName(title);
    }

    @GetMapping(path = "/titleCountV")
    public long getTotalBlogsByValue(@RequestParam("title") String title) {
        return blogService.getTotalBlogsByTitleValue(title);
    }

    @GetMapping(path = "/titleCountEx")
    public long getTotalBlogsByTitleExplicit(@RequestParam("title") String title) {
        return blogService.getTotalBlogsByTitleExplicit(title);
    }

    @GetMapping(path = "/titleCountEn")
    public long getTotalBlogsByTitleEntity(@RequestParam("title") String title) {
        return blogService.getTotalBlogsByTitleEntity(title);
    }
}