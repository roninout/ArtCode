package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
5) Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
пара равных
 */

public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е число:");
        int a = sc.nextInt();
        System.out.println("Введите 2-е число:");
        int b = sc.nextInt();
        System.out.println("Введите 3-е число:");
        int c = sc.nextInt();

        if (a == b)
            System.out.println("1-е = 2-у");
        else {
            if (a == c)
                System.out.println("1-е = 3-у");
            else
                if (b == c) System.out.println("2-е = 3-у");
        }
    }
}
