package com.google.objects;

public class User {
    // Create POJO class  for API Request Body

    private String firstName;
    private String lastName;

    private String middleName;

    private String employeeId;
    private String empPicture;



    private String otherId;



    private String drivingLicenseNo;
    private String drivingLicenseExpiredDate;
    private String gender;
    private String maritalStatus;
    private String birthday;
    private String nationalityId;
    private String sinNumber;



    public User(String firstName, String middleName, String lastName, String empPicture,String employeeId){

        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.empPicture=empPicture;
        this.employeeId=employeeId;
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
