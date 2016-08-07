package com.cloudbees.challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carlos.cornejo on 07/08/16.
 */
public class Date {

    private int day;
    private int month;
    private int year;
    private static final Map<Integer, Integer> daysPerMonth;

    static {
        daysPerMonth = new HashMap<Integer, Integer>();
        daysPerMonth.put(1, 31);
        daysPerMonth.put(2, 28);
        daysPerMonth.put(3, 31);
        daysPerMonth.put(4, 30);
        daysPerMonth.put(5, 31);
        daysPerMonth.put(6, 30);
        daysPerMonth.put(7, 31);
        daysPerMonth.put(8, 31);
        daysPerMonth.put(9, 30);
        daysPerMonth.put(10, 31);
        daysPerMonth.put(11, 30);
        daysPerMonth.put(12, 31);
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void add(int numOfDays) {

        while (numOfDays + getDay() > daysPerMonth.get(getMonth())) {

            numOfDays -= daysPerMonth.get(getMonth());

            if (this.getMonth() < 12) {
                this.month++;
            } else {
                this.month = 1;
                this.year++;
            }
        }

        this.day += numOfDays;
    }
}
