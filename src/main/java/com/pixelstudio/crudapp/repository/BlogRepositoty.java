package com.pixelstudio.crudapp.repository;

import com.pixelstudio.crudapp.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepositoty extends JpaRepository<Blog,Long> {

}
