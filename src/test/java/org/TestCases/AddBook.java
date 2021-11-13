package org.TestCases;

import Files.PayLoad;
import POJO.InputPayLoad;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class AddBook {

    private String ID;

    public String getID() {
        return ID;
    }

    @Test
    public void addBook(){

        RestAssured.baseURI = "http://216.10.245.166";
        InputPayLoad ip = new InputPayLoad();
        ip.setName("AXYZ");
        ip.setAisle("gh5ty");
        ip.setIsbn("5874222");
        ip.setAuthor("IUYT4BV");

        RequestSpecification req = new RequestSpecBuilder().setContentType(ContentType.JSON)
                .setBaseUri("http://216.10.245.166").build();

        RequestSpecification res = given().spec(req).body(ip);

        String response = res.when().post("Library/Addbook.php")
                .then().assertThat()
                .statusCode(200).extract().response().asString();

        JsonPath js = new JsonPath(response);

        System.out.println("The Resonse Message is: "+js.getString("Msg"));
        System.out.println("The ID is: "+js.getString("ID"));

        this.ID = js.getString("ID");

    }
}
