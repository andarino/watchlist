package com.springboot.watchlist.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Image {

    @JsonProperty
    public Integer height;
    @JsonProperty
    public String id;
    @JsonProperty
    public String url;
    @JsonProperty
    public Integer width;
    

    public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
     * No args constructor for use in serialization
     *
     */
    public Image() {
    }

    /**
     *
     * @param width
     * @param id
     * @param url
     * @param height
     */
    public Image(Integer height, String id, String url, Integer width) {
        super();
        this.height = height;
        this.id = id;
        this.url = url;
        this.width = width;
    }

}