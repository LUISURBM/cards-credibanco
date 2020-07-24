package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "authenticateUser")
public class AuthenticateUser {
 private String email;
 private String password;


 // Getter Methods 

 public String getEmail() {
  return email;
 }

 public String getPassword() {
  return password;
 }
 // Setter Methods 

 public void setEmail(String email) {
  this.email = email;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 
}