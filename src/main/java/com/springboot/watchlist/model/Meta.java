package com.springboot.watchlist.model;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Meta {

    public String operation;
    public String requestId;
    public Float serviceTimeMs;

    /**
     * No args constructor for use in serialization
     *
     */
    public Meta() {
    }

    /**
     *
     * @param requestId
     * @param serviceTimeMs
     * @param operation
     */
    public Meta(String operation, String requestId, Float serviceTimeMs) {
        super();
        this.operation = operation;
        this.requestId = requestId;
        this.serviceTimeMs = serviceTimeMs;
    }

}