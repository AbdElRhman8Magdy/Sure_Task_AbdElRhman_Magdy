package com.google.base.config;

import com.google.API.RegisterAPI;

public class EndPoint {
    static RegisterAPI registerAPI = new RegisterAPI();
    public final static String API_REGISTER_ENDPOINT = "/api/v1/users/register";
    public final static String API_TASK_ENDPOINT = "pim/employees/%s/personal-details";
    public final static String API_TASK_ENDPOINT1 = "pim/employees/110/personal-details";
    public final static String API_NewPage_ENDPOINT = "/todo";
    public final static String API_NewToDoPage_ENDPOINT = "/todo/new";

    public final static String API_BaseURI_ENDPOINT = "https://todo.qacart.com";

    public final static String API_BaseURI_ENDPOINT_Task = "https://opensource-demo.orangehrmlive.com/web/index.php/api/v2/";

    public final static String API_REGISTER_ENDPOINT_Task = "pim/employees";

    public final static String API_REGISTER_Token = "77f6a232bc16d2ccebdcae6d843fb124";


}
