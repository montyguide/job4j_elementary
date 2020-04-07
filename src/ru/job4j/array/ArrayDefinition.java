package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        int[] nums = new int[5];
        nums[0] = 2006;
        nums[1] = 2010;
        nums[2] = 2014;
        nums[3] = 2018;
        nums[4] = 2022;
        int years = nums[3];
        System.out.println(years);

        String[] names = new String[4];
        names[0] = "Саша";
        names[1] = "Дима";
        names[2] = "Витя";
        names[3] = "Никита";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
