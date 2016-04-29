package com.payforeign.article;

import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ArticleRepository extends CrudRepository<Article, Long> {

    List<Article> findByName(String name);

}
