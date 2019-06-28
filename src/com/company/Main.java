package com.company;

public class Main {

    public static void main(String[] args) {
        String names [] = {"Адилет", "Арген", "Арслан"};
        for (int i=0; i<names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Доброе утро Адилет");
                    break;
                case 1:
                    System.out.println("Добрый день Арген");
                    break;
                case 2:
                    System.out.println("Добрый вечер Арслан");
                    break;


            }
        }
    }
}
//switch (a) {
//            case 1:
//                System.out.println("число равно 1");
//                break;
//            case 2:
//                System.out.println("число равно 2");
//                break;
//            case 3:
//                System.out.println("число равно 3");
//                break;
//            default:
//                System.out.println("число не угадано");
//                break;