package com.springboot.watchlist.model;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Summary {

    public String category;
    public List<String> characters = null;
    public String displayYear;

    /**
     * No args constructor for use in serialization
     *
     */
    public Summary() {
    }

    /**
     *
     * @param characters
     * @param category
     * @param displayYear
     */
    public Summary(String category, List<String> characters, String displayYear) {
        super();
        this.category = category;
        this.characters = characters;
        this.displayYear = displayYear;
    }

}