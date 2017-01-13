package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 13.01.2017.
 */

// 4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

public class task_4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число:");
        float numb = sc.nextFloat();

        System.out.println(numb > 0 && numb < 1 ? "Число " + numb + " входит в диапазон" : "Число " + numb + " не входит в диапазон");
    }
}
