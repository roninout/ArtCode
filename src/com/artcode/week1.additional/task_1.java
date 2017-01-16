package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
    1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
    лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
*/
public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1-ю строну трегуольника:");
        double a = sc.nextDouble();
        System.out.println("Введите 2-ю строну трегуольника:");
        double b = sc.nextDouble();
        System.out.println("Введите 3-ю строну трегуольника:");
        double c = sc.nextDouble();

        if (a == Math.sqrt(b*b + c*c) || b == Math.sqrt(a*a + c*c) || c == Math.sqrt(a*a + b*b))
            System.out.println("Треуголльник прямоугольный");
        else
            System.out.println("Треуголльник не прямоугольный");
    }
}
