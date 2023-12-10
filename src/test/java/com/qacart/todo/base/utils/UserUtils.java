package com.qacart.todo.base.utils;

import com.github.javafaker.Faker;
import com.qacart.todo.objects.EditUser;
import com.qacart.todo.objects.User;

public class UserUtils {
    public static User GenerateRndmUser(){

        String firstName = new Faker().name().firstName();
        String middleName = new Faker().name().name();

        String lasttName = new Faker().name().lastName();
//        String email = new Faker().internet().emailAddress();
//        String passwrod = "12345678";
        String empPicture = null;
        String employeeId = "0378";

        User user = new User(firstName,middleName,lasttName,empPicture,employeeId);


        return user;
    }

    public static EditUser GenerateEditdmUser(){

        String firstName = new Faker().name().firstName();
        String middleName = new Faker().name().name();
        String lasttName = new Faker().name().lastName();
        String employeeId = "0378";
        String otherId = "5";
        String drivingLicenseNo = "5845";
        String drivingLicenseExpiredDate = "2025-08-31";
        String gender = "1";
        String maritalStatus = "Single";
        String birthday = "1999-11-30";
        int nationalityId = 55;
        String sinNumber = "01452144";

        EditUser editUser = new EditUser(firstName,middleName,lasttName,employeeId,otherId,drivingLicenseNo,drivingLicenseExpiredDate,gender
        ,maritalStatus,birthday,nationalityId,sinNumber);
        return editUser;

    }
}
