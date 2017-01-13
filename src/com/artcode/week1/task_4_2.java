package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 27.10.2016.
 */

// 4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

public class task_4_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 1-е число:");
        int numb1 = sc.nextInt();
        System.out.println("Введите 2-е число:");
        int numb2 = sc.nextInt();
        System.out.println("Введите 3-е число:");
        int numb3 = sc.nextInt();

        int max = numb1, min = numb1;

        if (numb2 > max) max = numb2;
        if (numb3 > max) max = numb3;

        if (numb2 < min) min = numb2;
        if (numb3 < min) min = numb3;

        System.out.println("Max = " +max+ ", Min = " + min);
    }
}
