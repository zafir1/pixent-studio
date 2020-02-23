package com.pixelstudio.crudapp.controller.blog;

import com.pixelstudio.crudapp.model.Blog;
import com.pixelstudio.crudapp.repository.BlogRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    private BlogRepositoty blogRepositoty;

    @GetMapping("/blogs")
    public List<Blog> getBlogs(){
        return blogRepositoty.findAll();
    }

    @GetMapping("/blogs/{id}")
    public Blog getBlogById(@PathVariable(value = "id")Long id) throws Exception {
        return blogRepositoty.findById(id).orElseThrow(() -> new Exception("Blog with id= " + id + " doesn't exist."));
    }

    @PostMapping("/blogs")
    public Blog createBlog(@Valid @RequestBody Blog blog){
        return blogRepositoty.save(blog);
    }

    @PutMapping("/blogs/{id}")
    public Blog updateBlog(@PathVariable(value = "id")Long id, @Valid @RequestBody Blog blog) throws Exception{
        Blog b = getBlogById(id);
        b.setTitle(blog.getTitle());
        b.setContent(blog.getContent());
        return blogRepositoty.save(b);
    }

    public ResponseEntity<?> deleteBlog(@PathVariable(value = "id")Long id) throws Exception{
        blogRepositoty.delete(getBlogById(id));
        return ResponseEntity.ok().build();
    }

}
