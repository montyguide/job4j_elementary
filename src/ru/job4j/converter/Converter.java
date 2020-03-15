package ru.job4j.converter;

public class Converter {
    // формула перевода рублей в евро.
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    // формула перевода рублей в доллоры.
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    // формула перевода евро в рубли.
    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    // формула перевода долларов в рубли.
    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        int rubleEuro = Converter.rubleToEuro(140);
        int rubleDollar = Converter.rubleToDollar(140);
        int euroRuble = Converter.euroToRuble(140);
        int dollarRuble = Converter.dollarToRuble(140);
        System.out.println("140 рублей = " + rubleEuro + " евро.");
        System.out.println("140 рублей = " + rubleDollar + " доллара.");
        System.out.println("140 евро = " + euroRuble + " рублей.");
        System.out.println("140 долларов = " + dollarRuble + " рублей.");
    }
}