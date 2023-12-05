package com.qacart.todo.base.utils;

import com.github.javafaker.Faker;
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
}
