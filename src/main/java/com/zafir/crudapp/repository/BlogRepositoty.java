package com.zafir.crudapp.repository;

import com.zafir.crudapp.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepositoty extends JpaRepository<Blog,Long> {

}
