package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 13.01.2017.
 */

// 4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

public class task_4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        int numb = sc.nextInt();

        if (numb % 7 == 0) System.out.println(numb * 2);
    }
}
