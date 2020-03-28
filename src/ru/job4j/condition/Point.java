package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(-2, 4, 8, 3);
        System.out.println("Расстояние между двумя точками A1(x1, y1) и A2(x2, y2) = " + result);
        int a = 6;
        int b = 6;
        int c = 6;
        int p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(s);
    }
}
