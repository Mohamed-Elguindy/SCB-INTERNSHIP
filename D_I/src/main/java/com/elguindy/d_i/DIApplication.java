package com.elguindy.d_i;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIApplication{
    private final Dev dev;
    private final Lead lead;
    public DIApplication(Dev dev, Lead lead) {
        this.dev = dev;
        this.lead = lead;
    }
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DIApplication.class, args);
        DIApplication app = context.getBean(DIApplication.class);
        System.out.println(app.dev.build());
        System.out.println(app.lead.build());
    }
}

