package base;

import io.restassured.RestAssured;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.RequestSpecification;

import static constants.ServiceConstants.BASE_URL;

public class BaseRequest {

    public FilterableRequestSpecification base() {
        return (FilterableRequestSpecification) RestAssured.given()
                .baseUri(BASE_URL)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .log().all();
    }
}