package com.quizzionaire.sampleprojectinjection;

import com.quizzionaire.sampleprojectinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SampleProjectInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SampleProjectInjectionApplication.class, args);
        MyController controller = ctx.getBean(MyController.class);
        System.out.println("Iam main method");
        System.out.println(controller.sayHello());
    }

}
