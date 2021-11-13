package org.TestCases;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class getBookbyAuthorName {

    @Test
    public void getBookbyAuthorName(){

        RestAssured.baseURI = "http://216.10.245.166";

        String response = given().queryParam("AuthorName","IUYT4BV")
                .contentType(ContentType.JSON).get("/Library/GetBook.php")
                .then().log().all().assertThat().statusCode(200).extract().response().asString();

        JsonPath js = new JsonPath(response);

        System.out.println("Book Details: ");
        System.out.println("Book Name: "+js.getString("book_name"));
        System.out.println("ISBN: "+js.getString("isbn"));
        System.out.println("AISLE: "+js.getString("aisle"));


    }

}
