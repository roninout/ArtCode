package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 13.01.2017.
 */

// 4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

public class task_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1-е число:");
        int numb1 = sc.nextInt();
        System.out.println("Введите 2-е число:");
        int numb2 = sc.nextInt();

        System.out.println(numb1 > numb2 ? numb1 - numb2 : numb1 + numb2);
    }
}
