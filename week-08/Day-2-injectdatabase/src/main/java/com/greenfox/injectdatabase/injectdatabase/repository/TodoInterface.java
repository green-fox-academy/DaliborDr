package com.greenfox.injectdatabase.injectdatabase.repository;

import com.greenfox.injectdatabase.injectdatabase.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoInterface extends CrudRepository<Todo, Long> {
}
