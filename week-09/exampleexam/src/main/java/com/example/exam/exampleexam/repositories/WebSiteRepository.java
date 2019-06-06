package com.example.exam.exampleexam.repositories;

import com.example.exam.exampleexam.models.WebSite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebSiteRepository extends CrudRepository<WebSite,Long> {

    WebSite findByAlias(String alias);
}
