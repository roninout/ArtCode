package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
14) Определить, является ли шестизначное число "счастливым" (сумма
первых трех цифр равна сумме последних трех цифр).
 */

public class task_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите шестизначное число:");
        int x = sc.nextInt();

        int x1 = x%10;
        int x2 = x/10%10;
        int x3 = x/100%10;
        int x4 = x/1000%10;
        int x5 = x/10000%10;
        int x6 = x/100000%10;

        System.out.println(x1 + x2 + x3 == x4 + x5 + x6 ? "Число счастливое" : "Число не счастливое");
    }
}
