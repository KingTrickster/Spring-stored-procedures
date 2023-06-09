package com.trxjster.springstoredprocedures.v1.controller;

import com.trxjster.springstoredprocedures.v1.service.BlogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/titleCount")
    public List getTotalBlogs(){
        return blogService.getTotalBlogs();
    }
    @GetMapping(path = "/titleCountP")
    public List getBlogsByTitle(@RequestParam("blogTitle") String title) {
        return blogService.getBlogsByTitle(title);
    }
}