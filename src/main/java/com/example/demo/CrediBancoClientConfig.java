package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


public class CrediBancoClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
            Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
            marshaller.setContextPath("com.example.demo.auth");
            return marshaller;
    }

    @Bean
    public CheckOutClient setUpClient(Jaxb2Marshaller marshaller) {
            CheckOutClient client = new CheckOutClient();
            client.setDefaultUri("https://testsrv.credibanco.com/CheckOutWSWeb/CheckoutWSService?wsdl");
            client.setMarshaller(marshaller);
            client.setUnmarshaller(marshaller);
            return client;
    }
}