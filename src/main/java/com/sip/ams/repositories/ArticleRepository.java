package com.sip.ams.repositories;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sip.ams.entities.Article;
import com.sip.ams.entities.Provider;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
