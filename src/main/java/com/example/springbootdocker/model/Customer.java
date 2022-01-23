package com.example.springbootdocker.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;


public class Customer {

    @Id
    private String id;

    @Indexed(unique = true,name="firstNameIndex")
    private String firstName;

    private String lastName;
    private String age;
    private String job;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer(String id, String firstName, String lastName, String age, String job) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.job = job;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Customer() {
    }

}
