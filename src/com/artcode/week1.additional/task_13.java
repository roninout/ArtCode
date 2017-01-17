package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
13) Даны три числа A,B,C. Увеличить числа в два
раза, если A+B+C>0, в противном случае заменить
на нули.
*/

public class task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите А:");
        int a = sc.nextInt();
        System.out.println("Введите B:");
        int b = sc.nextInt();
        System.out.println("Введите C:");
        int c = sc.nextInt();

        if (a + b + c > 0) {
            a = a*2;
            b = b*2;
            c = c*2;
        }
        else
            a = b = c = 0;
        System.out.println("A = " + a + " ,B = " + b + " ,C = " + c);
    }
}
