package com.vaccination.entity;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String FullName;

    private int Age;

    private String EmailID;
    private long PhoneNumber;

    public UserDetails(String fullName, int age, String emailID, long phoneNumber) {
        FullName = fullName;
        Age = age;
        EmailID = emailID;
        PhoneNumber = phoneNumber;
    }

    public UserDetails() {


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", FullName='" + FullName + '\'' +
                ", Age=" + Age +
                ", EmailID='" + EmailID + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                '}';
    }
}
