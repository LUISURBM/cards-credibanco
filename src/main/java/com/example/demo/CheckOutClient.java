package com.example.demo;

import com.example.demo.model.AuthenticateUser;
import com.example.demo.model.AuthenticateUserResponse;
import com.example.demo.model.GetUser;
import com.example.demo.model.GetUserCards;
import com.example.demo.model.GetUserCardsResponse;
import com.example.demo.model.GetUserResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CheckOutClient extends WebServiceGatewaySupport {

    private static final Logger logger = LoggerFactory.getLogger(CheckOutClient.class);
    private String authenticated = "";

    public AuthenticateUserResponse doAuth(String username, String password) {

        AuthenticateUser request = new AuthenticateUser();
        request.setEmail(username);
        request.setPassword(password);

        logger.info("Requesting information for " + username);

        AuthenticateUserResponse response = (AuthenticateUserResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        if( response.getReturn().getMensaje().equals("Exitoso") ) this.authenticated = username;
        else this.authenticated = "";
        return response;
    }

    public GetUserResponse getUser(String email, String username) throws Exception {
        if( !authenticated.equals(username) ) throw new Exception("No autenticatdo");

        GetUser request = new GetUser();
        request.setEmail(email);

        logger.info("Requesting information for " + email);

        GetUserResponse response = (GetUserResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }

    public GetUserCardsResponse getUserCards(String documentNumner, String auditoria, String username) throws Exception {
        if( !authenticated.equals(username) ) throw new Exception("No autenticatdo");

        GetUserCards request = new GetUserCards();
        request.setAuditoria(auditoria);
        request.setDocumentNumber(documentNumner);

        logger.info("Requesting information for " + documentNumner, auditoria );

        GetUserCardsResponse response = (GetUserCardsResponse) getWebServiceTemplate().marshalSendAndReceive(request);

        return response;
    }
}