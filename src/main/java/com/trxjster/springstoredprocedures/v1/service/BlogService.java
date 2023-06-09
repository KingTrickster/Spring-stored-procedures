package com.trxjster.springstoredprocedures.v1.service;

import com.trxjster.springstoredprocedures.v1.entity.Blog;
import com.trxjster.springstoredprocedures.v1.repository.BlogRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    @PersistenceContext
    private final EntityManager em;

    public BlogService(BlogRepository blogRepository, EntityManager em) {
        this.blogRepository = blogRepository;
        this.em = em;
    }

    public List getTotalBlogs(){
        return em.createNamedStoredProcedureQuery("getAllBlogs").getResultList();
    }
    public List<Blog> getBlogsByTitle(String title) {
        return em.createNamedStoredProcedureQuery("getBlogsByTitle").setParameter("tblogTitle",title).getResultList();
    }
}