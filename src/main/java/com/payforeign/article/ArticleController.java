package com.payforeign.article;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/service")
public class ArticleController {
    
    @Autowired
    private ArticleRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "article/index";
    }
    
    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public String create(Article article) {
        return "article/createOrEdit";
    }
    
    @RequestMapping(path = "/edit/{articleId:\\d+}", method = RequestMethod.GET)
    public String edit(@PathVariable Long articleId, Model model) {
       Article article = repository.findOne(articleId);
       model.addAttribute(article);
       return "article/createOrEdit";
    }
    
    @RequestMapping(path = "/store", method = RequestMethod.POST)
    public String store(@Valid Article article, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "article/createOrEdit";
        }
        repository.save(article);
        return "redirect:/service/create";
    }
    
    @RequestMapping(path = "/{articleName:[a-z]+}", method = RequestMethod.GET)
    public String show(@PathVariable String articleName, Model model) {
        model.addAttribute("articleName", articleName);
        return "article/show";
    }
}
