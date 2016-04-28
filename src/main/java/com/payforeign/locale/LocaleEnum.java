/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.payforeign.locale;

/**
 *
 * @author martin
 */
public enum LocaleEnum {
    
    en("en", "English"), cs("cs", "Czech");
    
    private final String locale;
    private final String desc;

    LocaleEnum(String locale, String desc)
    {
         this.locale = locale;
         this.desc = desc;
    }

    public String getLocale()
    {
        return locale;
    }

    public String getDesc()
    {
        return desc;
    }
 
    
}