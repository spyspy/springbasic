package com.springclass.basic.service;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is YOUR LUCKY DAY!!!!";
    }
}
