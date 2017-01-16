package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
ду. Какая из них больше?
 */
public class task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость в км/час:");
        double a = sc.nextDouble();
        System.out.println("Введите скорость в м/сек:");
        double b = sc.nextDouble();

        if (a > (36*b)/10)
            System.out.println(a + " > " + b + " потому как " + b + " м/сек = "+ (36*b)/10+ " км/час");
        else
            System.out.println(a + " < " + b + " потому как " + b + " м/сек = "+ (36*b)/10+ " км/час");
    }
}
