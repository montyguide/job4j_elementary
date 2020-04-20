package ru.job4j;

import ru.job4j.array.FindLoop;
import ru.job4j.array.MinDiapason;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int indexFor = 0; indexFor < data.length; indexFor++) {
            int min = MinDiapason.findMin(data, indexFor, data.length);
            int index = FindLoop.indexOf2(data, min, indexFor, data.length);
            int temp = data[indexFor];
            data[indexFor] = data[index];
            data[index] = temp;
        }
        return data;
    }
}