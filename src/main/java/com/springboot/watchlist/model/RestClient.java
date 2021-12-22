package com.springboot.watchlist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class RestClient {
    @JsonProperty
    public Meta meta;
    @JsonProperty
    public String type;
    @JsonProperty
    public String query;
    @JsonProperty
    public List<Result> results = null;
    @JsonProperty
    public List<String> types = null;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     * No args constructor for use in serialization
     *
     */
    public RestClient() {
    }

    /**
     *
     * @param types
     * @param meta
     * @param query
     * @param type
     * @param results
     */
    public RestClient(Meta meta, String type, String query, List<Result> results, List<String> types) {
        super();
        this.meta = meta;
        this.type = type;
        this.query = query;
        this.results = results;
        this.types = types;
    }

}
