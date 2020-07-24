package com.example.demo;

import com.example.demo.controller.CardsController;
import com.example.demo.model.AuthenticateUserResponse;
import com.example.demo.model.Return;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest
class DemoApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private CardsController cardsController;

    @Test
    void contextLoads() {
        assertThat(this.cardsController).isNotNull();
    }

    @Test
    void testAuthenticateUser() {
        Map<String, String> urlVar = new HashMap<String, String>();
        urlVar.put("username", "lurbina@gmail.com");
        urlVar.put("password", "lurbina1@gmail.com");
        Object response = this.restTemplate.postForObject("http://localhost:" + port + "/authenticateUser", null,
                String.class, urlVar);
        AuthenticateUserResponse expected = new AuthenticateUserResponse();
        Return ReturnObject = new Return();
        ReturnObject.setEstado("02");
        ReturnObject.setMensaje("Lo sentimos, estás usando datos inválidos, intenta nuevamente");
        expected.setReturn(ReturnObject);
        assertThat(response).isEqualTo(ReturnObject);
    }

    @Test
    void testGetUser() {
        Map<String, String> urlVar = new HashMap<String, String>();
        urlVar.put("username", "pruebas.pago@credibanco.com");
        urlVar.put("email", "pruebas.pago@credibanco.com");
        Exception error = assertThrows(Exception.class, () -> {
            this.restTemplate.postForObject("http://localhost:" + port + "/getUser", null, String.class,
                    urlVar);
        });
        assertThat(response).isEqualTo(ReturnObject);

    }
}
