package com.bridgelabz.Gambling;

public class GamblingProblem {
    static int DAILY_STAKE = 100;
    static int PER_DAY_BET = 1;
    static int win = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator");
        int result = (int) (Math.random() * 10) % 2;
        if (result == win) {
            DAILY_STAKE++;
            System.out.println("Won");
        } else {
            DAILY_STAKE--;
            System.out.println("lost");
        }
        System.out.println(DAILY_STAKE);
    }
}
