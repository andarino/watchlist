package com.springboot.watchlist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Principal {

    @JsonProperty
    public String id;
    @JsonProperty
    public String legacyNameText;
    @JsonProperty
    public String name;
    @JsonProperty
    public String category;
    @JsonProperty
    public List<String> characters = null;
    @JsonProperty
    public Integer endYear;
    @JsonProperty
    public Integer episodeCount;
    @JsonProperty
    public List<Role> roles = null;
    @JsonProperty
    public Integer startYear;
    @JsonProperty
    public String disambiguation;
    @JsonProperty
    public Integer billing;
    @JsonProperty
    public List<String> attr = null;
    @JsonProperty
    public String as;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLegacyNameText() {
        return legacyNameText;
    }

    public void setLegacyNameText(String legacyNameText) {
        this.legacyNameText = legacyNameText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getCharacters() {
        return characters;
    }

    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Integer getEpisodeCount() {
        return episodeCount;
    }

    public void setEpisodeCount(Integer episodeCount) {
        this.episodeCount = episodeCount;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public String getDisambiguation() {
        return disambiguation;
    }

    public void setDisambiguation(String disambiguation) {
        this.disambiguation = disambiguation;
    }

    public Integer getBilling() {
        return billing;
    }

    public void setBilling(Integer billing) {
        this.billing = billing;
    }

    public List<String> getAttr() {
        return attr;
    }

    public void setAttr(List<String> attr) {
        this.attr = attr;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public Principal() {
    }

    /**
     *
     * @param episodeCount
     * @param roles
     * @param startYear
     * @param endYear
     * @param billing
     * @param characters
     * @param as
     * @param legacyNameText
     * @param name
     * @param disambiguation
     * @param id
     * @param category
     * @param attr
     */
    public Principal(String id, String legacyNameText, String name, String category, List<String> characters, Integer endYear, Integer episodeCount, List<Role> roles, Integer startYear, String disambiguation, Integer billing, List<String> attr, String as) {
        super();
        this.id = id;
        this.legacyNameText = legacyNameText;
        this.name = name;
        this.category = category;
        this.characters = characters;
        this.endYear = endYear;
        this.episodeCount = episodeCount;
        this.roles = roles;
        this.startYear = startYear;
        this.disambiguation = disambiguation;
        this.billing = billing;
        this.attr = attr;
        this.as = as;
    }

}