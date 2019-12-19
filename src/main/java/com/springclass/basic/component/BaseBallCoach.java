package com.springclass.basic.component;

import org.springframework.stereotype.Component;


// Define bean id on your own

@Component("baseBaby")
public class BaseBallCoach implements CoachInterface {
    public void getDailyPractice() {
        System.out.println("BaseBallCoach: getDailyPractice()");
    }

    @Override
    public void getDailyFortune() {

    }
}
