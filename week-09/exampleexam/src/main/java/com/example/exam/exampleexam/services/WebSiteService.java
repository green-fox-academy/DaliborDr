package com.example.exam.exampleexam.services;

import com.example.exam.exampleexam.models.WebSite;
import com.example.exam.exampleexam.repositories.WebSiteRepository;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebSiteService {

    WebSiteRepository repo;

    @Autowired
    public WebSiteService(WebSiteRepository repo) {
        this.repo = repo;
    }

    public WebSite createAlias(String url, String alias) {
        WebSite webSite = new WebSite(url,alias);
        if (repo.findByAlias(alias) == null) {
            repo.save(webSite);
            return webSite;
        } else {
            return null;
        }
    }

    public String getSecretCode(String alias) {
        return repo.findByAlias(alias).getSecretCode();
    }

    public boolean isPresent(String alias) {
        if (repo.findByAlias(alias) != null) {
            return true;
        }
        return false;
    }

    public WebSite findByAlias(String alias) {
        return repo.findByAlias(alias);
    }

    public List<WebSite> findAllWebSites() {
        List<WebSite> webSites = new ArrayList<>();
        repo.findAll().forEach(webSites::add);
        return webSites;
    }

    public void saveWebite(WebSite website) {
        repo.save(website);
    }


}
