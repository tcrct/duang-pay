package com.duangframework.pay;

import com.duangframework.mvc.http.enums.EnvEnum;
import com.duangframework.server.Application;

public class Duang {

    public static void main(String[] args) {
        Application.duang().port(9494)
                .env(EnvEnum.DEV)
                .run();
    }
}
