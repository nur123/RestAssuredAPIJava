package api;

import base.BaseRequest;
import base.ResponseData;
import io.restassured.response.Response;
import models.CreateAccountData;
import models.ResponseAccountData;

import static constants.ServiceConstants.ENDPOINT_CREATE_ACCOUNT_USER;

public class CreateAccount extends BaseRequest {

    public ResponseData<ResponseAccountData> createaccountdata(CreateAccountData createaccountData) {
        Response response = base()
                .body(createaccountData)
                .post(ENDPOINT_CREATE_ACCOUNT_USER);

        response.then().log().all();
        ResponseAccountData responseBody = response.as(ResponseAccountData.class);
        return new ResponseData<>(response, responseBody);
    }
}