package com.trxjster.springstoredprocedures.entity;

import lombok.Data;

import javax.persistence.*;

@Entity @Data
@Table(name = "blog")
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllBlogs",procedureName = "getAllBlogs"),
        @NamedStoredProcedureQuery(name = "getBlogsByTitle", procedureName = "getBlogsByTitle",
                parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "tblogTitle",type=String.class)} )})

public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long blogId;
    @Column
    private String title;
    @Column
    private Integer yearOfPost;
}