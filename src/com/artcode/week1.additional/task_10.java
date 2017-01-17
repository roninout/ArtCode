package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
10) Написать программу вычисления стоимости переговоров, если по суббо-
там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
ность разговора и день недели (цифра от 1 до 7).
 */

public class task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите продолжительность разговора:");
        int iTime = sc.nextInt();
        System.out.println("и день недели:");
        int iDay = sc.nextInt();

        double dPrice = iTime * 0.54;

        switch (iDay) {
            case 6:
                dPrice = dPrice - iTime / 20.0;
                break;
            case 7:
                dPrice = dPrice - iTime / 20.0;
                break;
        }
         System.out.println("К оплате - " + dPrice);
    }
}
