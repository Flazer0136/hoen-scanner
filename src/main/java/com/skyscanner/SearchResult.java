package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {
    @JsonProperty
    private String city;

    @JsonProperty
    private String title;

    @JsonProperty
    private String kind;

    public SearchResult(String city, String title, String kind) {
        this.city = city;
        this.title = title;
        this.kind = kind;
    }

    public SearchResult() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
