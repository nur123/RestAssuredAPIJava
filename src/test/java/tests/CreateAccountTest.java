package tests;

import base.BaseTest;
import base.ResponseData;
import models.CreateAccountData;
import models.ResponseAccountData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class CreateAccountTest extends BaseTest {

    @Test
    @DisplayName("Create account API return 201 when using valid data")
    @Tag("positive")

    public void createAccount() {
        CreateAccountData requsetBody = new CreateAccountData("TOOLSQANEWOK3-Test5", "Test@@@@@1234568");
        ResponseData<ResponseAccountData> response = createAccount.createaccountdata(requsetBody);
        Assertions.assertEquals(201, response.getResponse().getStatusCode());
    }
}