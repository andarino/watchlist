package com.springboot.watchlist.model;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Cast {
    public String as;
    public Integer billing;
    public String category;
    public List<String> characters = null;
    public List<Role__1> roles = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public Cast() {
    }

    /**
     *
     * @param characters
     * @param as
     * @param roles
     * @param category
     * @param billing
     */
    public Cast(String as, Integer billing, String category, List<String> characters, List<Role__1> roles) {
        super();
        this.as = as;
        this.billing = billing;
        this.category = category;
        this.characters = characters;
        this.roles = roles;
    }

}