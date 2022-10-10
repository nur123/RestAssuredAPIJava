package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.DateFormat;
import java.util.Date;

public class CreateAccountData {

    public CreateAccountData(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @JsonProperty("userName")
    private String userName;

    @JsonProperty("password")
    private String password;

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}