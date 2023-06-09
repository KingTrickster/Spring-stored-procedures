package com.trxjster.springstoredprocedures.v2.repository;

import com.trxjster.springstoredprocedures.v2.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository("BlogRepositoryV2")
public interface BlogRepository extends JpaRepository<Blog, Long> {

    //Approach 1 – Stored procedure as the method name
    @Procedure
    int GET_TOTAL_BLOGS_BY_TITLE(String title);

    //Approach 2 – Stored procedure name as a String value
    @Procedure("GET_TOTAL_BLOGS_BY_TITLE")
    int getTotalBlogsByTitle(String title);

    //Approach 3 – Stored procedure name as the procedureName attribute
    @Procedure(procedureName = "GET_TOTAL_BLOGS_BY_TITLE")
    int getTotalBlogsByTitleProcedureName(String model);

    //Approach 4 – Stored procedure name as the value attribute
    @Procedure(value = "GET_TOTAL_BLOGS_BY_TITLE")
    int getTotalBlogsByTitleValue(String model);

    @Procedure(name = "Blog.getTotalBlogsByTitleEntiy")
    int getTotalBlogsByTitleEntiy(@Param("model_in") String model);
}
