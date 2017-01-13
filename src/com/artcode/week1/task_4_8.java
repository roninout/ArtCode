package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 13.01.2017.
 */

/*
4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
			124    4    -   true
			1456   567  -   false
			1      2    -   false
			18     98   -   true
*/

public class task_4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е число:");
        int numb1 = sc.nextInt();
        System.out.println("Введите 2-е число:");
        int numb2 = sc.nextInt();

        System.out.println(numb1 % numb2 == 0 ? "true = " + numb1 / numb2 + " " + numb1 % numb2 : "false = "  + numb1 / numb2 + " " + numb1 % numb2);
    }
}
