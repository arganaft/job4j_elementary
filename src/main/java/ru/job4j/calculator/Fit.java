package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl  =  (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 180;
        double man = Fit.manWeight(heightMan);
        System.out.println("Man 180 is " + man);
        short heightWoman = 172;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Woman 172 is " + woman);
    }

}