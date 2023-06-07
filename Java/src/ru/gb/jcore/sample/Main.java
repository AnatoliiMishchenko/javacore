package ru.gb.jcore.sample;

import ru.gb.jcore.regular.Decorator;
import ru.gb.jcore.regular.OtherClass;

public class Main {
    /**
     * вход в программу
     * @param args
     */
    public static void main(String[] args) {
        /**
         *
         */
        int result = 0;
        result = OtherClass.add(2,5);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.mul(5,5);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.div(5,8);
        System.out.println(Decorator.decorator(result));
        result = OtherClass.sub(8,9);
        System.out.println(Decorator.decorator(result));


    }
}
