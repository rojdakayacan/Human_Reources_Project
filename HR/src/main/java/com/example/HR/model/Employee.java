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
    private  String name ; // Çalışanın adı
    private String position; // Çalışanın pozisyonu

    // Getter and Setter metotları
    //Getter : Özel alanların değerini okumak için kullanılır .
    //Setter : Özel alanların değerini ayarlamak için kullanılır .,


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
