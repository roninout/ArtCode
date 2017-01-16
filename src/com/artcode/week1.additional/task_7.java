package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
времени года. Если пользователь введет недопустимое число, программа
должна выдать сообщение об ошибке.
 */

public class task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12:");
        int iMonth = sc.nextInt();

        String sMonth;
        switch (iMonth) {
            case 1:  sMonth = "Январь";
                break;
            case 2:  sMonth = "Февраль";
                break;
            case 3:  sMonth = "Март";
                break;
            case 4:  sMonth = "Апрель";
                break;
            case 5:  sMonth = "Май";
                break;
            case 6:  sMonth = "Июнь";
                break;
            case 7:  sMonth = "Июль";
                break;
            case 8:  sMonth = "Август";
                break;
            case 9:  sMonth = "Сентябрь";
                break;
            case 10: sMonth = "Октябрь";
                break;
            case 11: sMonth = "Ноябрь";
                break;
            case 12: sMonth = "Декабрь";
                break;
            default: sMonth = "Вы ввели неправильное значение месяца";
                break;
        }
        System.out.println(sMonth);
    }
}
