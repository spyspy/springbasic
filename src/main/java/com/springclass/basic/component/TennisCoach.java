package com.springclass.basic.component;

import org.springframework.stereotype.Component;

//Default bean id is: tennisCoach

@Component
public class TennisCoach implements CoachInterface{
    public void getDailyPractice() {
        System.out.println("TennisCoach: getDailyPractice()");
    }
}
