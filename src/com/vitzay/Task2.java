package com.vitzay;

//2) Найти количество счастливых билетиков на трамвай от 000001 до 999999
// (те у которых сумма первых 3 цифр равна сумме последних 3)
public class Task2 {
    public static final int MAX_NUMBER = 999_999;
    public static final int MIN_NUMBER = 1;
    public static void main(String[] args) {
        int sum = 0;
        for (int i = MIN_NUMBER; i < MAX_NUMBER; i++) {
            int number1 = i/100000;
            int number2 = (i%100000)/10000;
            int number3 = (i%10000)/1000;
            int number4 = (i%1000)/100;
            int number5 = (i%100)/10;
            int number6 = i%10;

            if (number1 + number2 + number3 == number4 + number5 + number6) {
                sum++;
            }
        }
        System.out.println("number of lucky tickets: " + sum);
    }
}
