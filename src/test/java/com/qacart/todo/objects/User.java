package com.qacart.todo.objects;

public class User {
    // Create POJO class  for API Request Body






    private String firstName;
    private String lastName;


    private String middleName;

    private String employeeId;
    private String empPicture;

    public User(String firstName, String middleName, String lastName, String empPicture,String employeeId){
        //Create constructor to be called from API request body
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.empPicture=empPicture;
        this.employeeId=employeeId;
    }

    //Create Getter and setter for User class by select all and alt + insert



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


    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpPicture() {
        return empPicture;
    }

    public void setEmpPicture(String empPicture) {
        this.empPicture = empPicture;
    }


}
