package com.example.demo.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getUserCards")
public class GetUserCards {
 private String documentNumber;
 private String auditoria;


 // Getter Methods 

 public String getDocumentNumber() {
  return documentNumber;
 }

 public String getAuditoria() {
  return auditoria;
 }
 // Setter Methods 

 public void setDocumentNumber(String documentNumber) {
  this.documentNumber = documentNumber;
 }

 public void setAuditoria(String auditoria) {
  this.auditoria = auditoria;
 }
}