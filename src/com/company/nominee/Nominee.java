package com.company.nominee;

import com.company.award.Award;

public class Nominee {

    private String name ;

    static {
        System.out.println("Nominee is initialized");
    }

    public Nominee(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void receiveAward(Award award) {

        System.out.println("Award amount is " + award.getValue());

    }

}
