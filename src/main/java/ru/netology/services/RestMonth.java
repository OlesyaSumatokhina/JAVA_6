package ru.netology.services;

public class RestMonth {
    public int restMonth(int income, int expense, int threshold) {

        int i = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                i++;
                money = (money - expense) / 3;
            } else {
                money = money + income - expense;
            }
        }
        return i;
    }

}
