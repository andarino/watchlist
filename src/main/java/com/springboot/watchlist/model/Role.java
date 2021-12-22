package com.springboot.watchlist.model;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Role {

    public String character;
    public String characterId;

    /**
     * No args constructor for use in serialization
     *
     */
    public Role() {
    }

    /**
     *
     * @param character
     * @param characterId
     */
    public Role(String character, String characterId) {
        super();
        this.character = character;
        this.characterId = characterId;
    }

}