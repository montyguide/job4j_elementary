package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int max = array.length - 1;
        int maxy = array.length / 2;
        for (int i = 0; i < maxy; i++, max--) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
        }
        return array;
    }
}
