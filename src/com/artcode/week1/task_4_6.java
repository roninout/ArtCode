package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 13.01.2017.
 */

// 4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19.

public class task_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1-е число:");
        int numb1 = sc.nextInt();
        System.out.println("Введите 2-е число:");
        int numb2 = sc.nextInt();

        int sum = numb1 + numb2;

        if (sum > 11 && sum < 19)
            System.out.println("Сумма: " + sum);
    }
}
