package com.springclass.basic;

import com.springclass.basic.component.CoachInterface;
import com.springclass.basic.service.GoodService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This is not Spring Boot!!!!!  Just normal Spring

public class SpringBasicMainEntryPoint {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //
        GoodService wow = (GoodService) context.getBean("GoodService");
        wow.getNewInfo();

        //
        CoachInterface coach1 = context.getBean("tennisCoach", CoachInterface.class);
        coach1.getDailyPractice();

        CoachInterface coach2 = context.getBean("baseBaby", CoachInterface.class);
        coach2.getDailyPractice();


        context.close();
    }
}
