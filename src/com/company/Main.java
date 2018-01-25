package com.company;

import com.company.award.Award;
import com.company.nominator.Nominator;
import com.company.nominee.Nominee;

public class Main {

    public static void main(String[] args) {
        Award award = new Award(100);
        Nominee nominee = new Nominee("Soo");
        Nominator nominator = new Nominator("Chloe");

        nominator.nominate(nominee, award);
    }
}
