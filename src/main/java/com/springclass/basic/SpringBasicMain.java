package com.springclass.basic;

import com.springclass.basic.component.CoachInterface;
import com.springclass.basic.service.GoodService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBasicMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //
        GoodService wow = (GoodService) context.getBean("GoodService");
        wow.getNewInfo();

        //
        CoachInterface coachInterface = context.getBean("tennisCoach", CoachInterface.class);
        coachInterface.getDailyPractice();

        context.close();
    }
}
