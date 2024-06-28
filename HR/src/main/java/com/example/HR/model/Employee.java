package com.example.HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


// Bu benim model sınıfım

@Entity // Bu sınıfın model sınıfı olduğunu belirtiyor. // Bu anatasyon , bu sınıfın bir veritabanı tablosuna karşılık geldiğini belirtir.

public class Employee {

    @Id  // Bu anatasyon , 'id' alanının birincil anahtar olduğunu belirtir.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Bu, 'id' alanının otomatik olarak artıralacağını belirtir .


    private  long Id; // Çalışanın benzersiz kimliği
    private  String firstName ; // Çalışanın adı
    private  String lastName ; // Çalışanın soyadı
    private String jobTitle;
    private String iban ;

    // Getter and Setter metotları

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }





    //Getter : Özel alanların değerini okumak için kullanılır .
    //Setter : Özel alanların değerini ayarlamak için kullanılır .,



}
