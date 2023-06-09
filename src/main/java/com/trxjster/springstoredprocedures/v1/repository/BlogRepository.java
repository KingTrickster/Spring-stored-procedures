package com.trxjster.springstoredprocedures.v1.repository;

import com.trxjster.springstoredprocedures.v1.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
