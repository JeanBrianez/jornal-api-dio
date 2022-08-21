package com.jornaldio.jornalapi.controller;

import com.jornaldio.jornalapi.AbstractContainerBase;
import com.jornaldio.jornalapi.controller.dto.AuthorCreateDTO;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AuthorControllerIT extends AbstractContainerBase {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest() {
        RestAssured.port = randomPort;
    }

    @Test
    void whenFindAllThenCheckResult() {

        RestAssured.given()
                .auth()
                .basic("user", "dio@123456")
                .when()
                .get("/author")
                .then()
                .statusCode(HttpStatus.OK.value());
    }

    @Test
    void whenCreateThenCheckIsCreated() {

        var createDTO = new AuthorCreateDTO();
        createDTO.setName("OK");
        createDTO.setRole("OK");
        createDTO.setEmail("ok@ok");

        RestAssured.given()
                .auth()
                .basic("user", "dio@123456")
                .when()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(createDTO)
                .post("/author")
                .then()
                .statusCode(HttpStatus.CREATED.value())
                .body("role", Matchers.equalTo("OK"));
    }
}