package com.springboot.watchlist.model;


import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Result {

    public String id;
    public Image image;
    public Integer runningTimeInMinutes;
    public String nextEpisode;
    public Integer numberOfEpisodes;
    public Integer seriesEndYear;
    public Integer seriesStartYear;
    public String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Integer getRunningTimeInMinutes() {
        return runningTimeInMinutes;
    }

    public void setRunningTimeInMinutes(Integer runningTimeInMinutes) {
        this.runningTimeInMinutes = runningTimeInMinutes;
    }

    public String getNextEpisode() {
        return nextEpisode;
    }

    public void setNextEpisode(String nextEpisode) {
        this.nextEpisode = nextEpisode;
    }

    public Integer getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(Integer numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public Integer getSeriesEndYear() {
        return seriesEndYear;
    }

    public void setSeriesEndYear(Integer seriesEndYear) {
        this.seriesEndYear = seriesEndYear;
    }

    public Integer getSeriesStartYear() {
        return seriesStartYear;
    }

    public void setSeriesStartYear(Integer seriesStartYear) {
        this.seriesStartYear = seriesStartYear;
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

    public List<Principal> getPrincipals() {
        return principals;
    }

    public void setPrincipals(List<Principal> principals) {
        this.principals = principals;
    }

    public List<String> getAkas() {
        return akas;
    }

    public void setAkas(List<String> akas) {
        this.akas = akas;
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

    public List<KnownFor> getKnownFor() {
        return knownFor;
    }

    public void setKnownFor(List<KnownFor> knownFor) {
        this.knownFor = knownFor;
    }

    public String getDisambiguation() {
        return disambiguation;
    }

    public void setDisambiguation(String disambiguation) {
        this.disambiguation = disambiguation;
    }

    public String titleType;
    public Integer year;
    public List<Principal> principals = null;
    public List<String> akas = null;
    public String legacyNameText;
    public String name;
    public List<KnownFor> knownFor = null;
    public String disambiguation;

    /**
     * No args constructor for use in serialization
     *
     */
    public Result() {
    }

    /**
     *
     * @param image
     * @param seriesStartYear
     * @param titleType
     * @param year
     * @param principals
     * @param title
     * @param nextEpisode
     * @param numberOfEpisodes
     * @param runningTimeInMinutes
     * @param akas
     * @param legacyNameText
     * @param knownFor
     * @param name
     * @param disambiguation
     * @param id
     * @param seriesEndYear
     */
    public Result(String id, Image image, Integer runningTimeInMinutes, String nextEpisode, Integer numberOfEpisodes, Integer seriesEndYear, Integer seriesStartYear, String title, String titleType, Integer year, List<Principal> principals, List<String> akas, String legacyNameText, String name, List<KnownFor> knownFor, String disambiguation) {
        super();
        this.id = id;
        this.image = image;
        this.runningTimeInMinutes = runningTimeInMinutes;
        this.nextEpisode = nextEpisode;
        this.numberOfEpisodes = numberOfEpisodes;
        this.seriesEndYear = seriesEndYear;
        this.seriesStartYear = seriesStartYear;
        this.title = title;
        this.titleType = titleType;
        this.year = year;
        this.principals = principals;
        this.akas = akas;
        this.legacyNameText = legacyNameText;
        this.name = name;
        this.knownFor = knownFor;
        this.disambiguation = disambiguation;
    }

}