package com.qacart.todo.testcases;


import com.qacart.todo.API.RegisterAPI;

import java.io.IOException;

public class dummyAPITestz {


        public static void main(String[] args) throws IOException {
            RegisterAPI registerAPI = new RegisterAPI();
            registerAPI.register();
            System.out.println("Tokeen  -> "+registerAPI.getToken());
            System.out.println("Coockiess -> "+registerAPI.getCookeis());
            System.out.println("USER FirstName -> "+registerAPI.getFirstName());
            System.out.println("UserID -> "+registerAPI.getUserID());
//            System.out.println(registerAPI.);

    }
}