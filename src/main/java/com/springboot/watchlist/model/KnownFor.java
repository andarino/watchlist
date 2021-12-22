package com.springboot.watchlist.model;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class KnownFor {

    public List<Cast> cast = null;
    public Summary summary;
    public String id;
    public String title;
    public String titleType;
    public Integer year;

    /**
     * No args constructor for use in serialization
     *
     */
    public KnownFor() {
    }

    /**
     *
     * @param summary
     * @param cast
     * @param titleType
     * @param year
     * @param id
     * @param title
     */
    public KnownFor(List<Cast> cast, Summary summary, String id, String title, String titleType, Integer year) {
        super();
        this.cast = cast;
        this.summary = summary;
        this.id = id;
        this.title = title;
        this.titleType = titleType;
        this.year = year;
    }

	public List<Cast> getCast() {
		return cast;
	}

	public void setCast(List<Cast> cast) {
		this.cast = cast;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
    
    

}