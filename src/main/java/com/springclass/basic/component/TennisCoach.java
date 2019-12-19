package com.springclass.basic.component;

import com.springclass.basic.service.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Default bean id is: tennisCoach (Class name and uncapitalized)

//@Component("BeanId")
@Component
public class TennisCoach implements CoachInterface{

    private FortuneService fortuneService;

    //Injection !!
    @Autowired
    public TennisCoach(FortuneService thefortuneService){
        fortuneService = thefortuneService;
    }

    public void getDailyPractice() {
        System.out.println("TennisCoach: getDailyPractice()");
    }
}
