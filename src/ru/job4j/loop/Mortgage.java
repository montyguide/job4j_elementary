package ru.job4j.loop;

public class Mortgage {
        public int year(int amount, int salary, double percent) {
            int year = 0;
            amount += ((amount / 100) * percent);
            for (int yearCount = 1; amount > 0; yearCount++) {
                amount -= salary;
                amount += ((amount / 100) * percent);
                year++;
            }
            return year;
        }
}
