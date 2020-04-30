package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;

                while (point < array.length-1) {
                    String temp = array[point];
                    array[point] = array[point+1];
                    array[point+1] = temp;
                    point++;
                }
            }
        }
        if (array[0] == null && array[1] != null) {
            array = compress(array);
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
