package com.qacart.todo.base.utils;

import com.github.javafaker.Faker;
import com.qacart.todo.objects.User;

public class UserUtils {
    public static User GenerateRndmUser(){

        String firstName = new Faker().name().firstName();
        String lasttName = new Faker().name().lastName();
        String email = new Faker().internet().emailAddress();
        String passwrod = "12345678";
        User user = new User(email,passwrod,firstName,lasttName);

        return user;
    }
}
