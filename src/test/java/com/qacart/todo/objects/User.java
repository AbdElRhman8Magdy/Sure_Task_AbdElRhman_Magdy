package com.qacart.todo.objects;

public class User {
    // Create POJO class  for API Request Body
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public User(String email,String password,String firstName,String lastName){
        //Create constructor to be called from API request body
        this.email=email;
        this.password=password;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    //Create Getter and setter for User class by select all and alt + insert

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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


}
