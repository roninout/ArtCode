package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
одинаковые; б) есть ли среди его цифр одинаковые.
 */

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзначное число:");
        int x = sc.nextInt();

        int a = x%10;
        int b = x/10%10;
        int c = x/100%10;

        if (a == b && a == c) System.out.println("Все цифры одинаковые");
        else
        {
            if (a == b) System.out.println("1-е = 2-у");
            if (a == c) System.out.println("1-е = 3-у");
            if (b == c) System.out.println("2-е = 3-у");
        }
    }
}
