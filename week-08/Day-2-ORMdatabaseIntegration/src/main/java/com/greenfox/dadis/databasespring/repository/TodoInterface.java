package com.greenfox.dadis.databasespring.repository;

import com.greenfox.dadis.databasespring.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoInterface extends CrudRepository<Todo, Long> {
}
