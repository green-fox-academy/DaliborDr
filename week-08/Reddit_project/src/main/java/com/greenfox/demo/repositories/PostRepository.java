package com.greenfox.demo.repositories;

import com.greenfox.demo.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

    Post findFirstById(Long id);
}
