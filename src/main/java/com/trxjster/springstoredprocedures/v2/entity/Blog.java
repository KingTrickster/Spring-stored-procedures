package com.trxjster.springstoredprocedures.v2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "BlogEntityV2") @Data
@Table(name = "blog")

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