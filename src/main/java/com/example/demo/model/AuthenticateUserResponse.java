package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "authenticateUserResponse")
public class AuthenticateUserResponse {
 Return ReturnObject;
 


 // Getter Methods 

 public Return getReturn() {
  return ReturnObject;
 }


 // Setter Methods 

 public void setReturn(Return returnObject) {
  this.ReturnObject = returnObject;
 }
}