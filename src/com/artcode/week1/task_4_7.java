package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 13.01.2017.
 */

// 4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
//      в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

public class task_4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-е число:");
        float numb1 = sc.nextFloat();
        System.out.println("Введите 2-е число:");
        float numb2 = sc.nextFloat();

        System.out.println(numb1 % numb2 == 0 ? "true = " + numb1 / numb2 : "false = " + numb1 / numb2);
    }
}
