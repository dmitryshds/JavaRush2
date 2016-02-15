package com.javarush.test.level37.lesson04.big01.male;

import com.javarush.test.level37.lesson04.big01.Human;

public class MaleFactory {



    public Human getPerson(int age)
    {
        if (age < 0)
        {return null;}

        if (age <= KidBoy.MAX_AGE)
        {
            return new KidBoy();
        }
        else if (age > KidBoy.MAX_AGE && age <= TeenBoy.MAX_AGE)
        {
            return new TeenBoy();
        }else {
            return new Man();

        }
    }
}
