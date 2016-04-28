package com.payforeign.article;

import com.payforeign.locale.LocaleEnum;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.bind.annotation.ModelAttribute;

@Entity
public class Article {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @NotEmpty
    private String locale;
    @NotEmpty
    private String name;
    @NotEmpty
    private String title;
    @NotEmpty
    private String description;
    @NotEmpty
    private String text; 
    
    private Timestamp created;
    private Timestamp updated;
   
    protected Article() {
    }

    public Article(Long id, String locale, String name, String title, String description, String text) {
        this.id = id;
        this.locale = locale;
        this.name = name;
        this.title = title;
        this.description = description;
        this.text = text;
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
    
    public String getName() {
        return name;
    }
    
    @ModelAttribute("locales")
    public LocaleEnum[] getLocales() {
        return LocaleEnum.values();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getCreated() {
        return created;
    }

    public Timestamp getUpdated() {
        return updated;
    }
    
}
