package com.example.demo.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getUser")
public class GetUser {
 private String email;


 // Getter Methods 

 public String getEmail() {
  return email;
 }

 // Setter Methods 

 public void setEmail(String email) {
  this.email = email;
 }

}