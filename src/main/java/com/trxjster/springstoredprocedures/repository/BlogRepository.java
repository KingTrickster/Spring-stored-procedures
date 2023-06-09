package com.trxjster.springstoredprocedures.repository;

import com.trxjster.springstoredprocedures.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
