package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
тельные заменить на 0.
 */
public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е число:");
        int a = sc.nextInt();
        System.out.println("Введите 2-е число:");
        int b = sc.nextInt();
        System.out.println("Введите 3-е число:");
        int c = sc.nextInt();

        a = a > 0 ? a * a * a : 0;
        b = b > 0 ? b * b * b : 0;
        c = a > 0 ? c * c * c : 0;

        System.out.println("a = " + a + " ,b = " + b + " ,c = " + c);
    }
}
