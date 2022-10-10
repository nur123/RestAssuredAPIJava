package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseAccountData {

    @JsonProperty("userID")
    private String userID;

    @JsonProperty("username")
    private String username;

    @JsonProperty("books")
    private Object books;
}