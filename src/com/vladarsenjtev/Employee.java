package com.vladarsenjtev;

public class Employee {
    private String fioPeople;
    private String position;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee(String fioPeople, String position, String email, int phoneNumber, int age) {
        this.fioPeople = fioPeople;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFioPeople() {
        return fioPeople;
    }

    public void setFioPeople(String fioPeople) {
        this.fioPeople = fioPeople;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fioPeople='" + fioPeople + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                '}';
    }
}