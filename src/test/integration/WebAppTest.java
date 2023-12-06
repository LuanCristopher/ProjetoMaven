package meuapp;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebAppTest {

    @Test
    public void testWebApp() {
        RestAssured.baseURI = "http://localhost:8080"; // Substitua pelo endereço do seu servidor
        Response response = get("/webapp"); // Substitua pela URL do seu servlet

        assertEquals(200, response.getStatusCode());
        assertEquals("Hello, World!", response.getBody().asString());
    }
}
