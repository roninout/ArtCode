package com.artcode.week1;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 27.10.2016.
 */
public class task_4_1 {
    public static void main(String[] args) {
        // create Scanner using "new" word
        Scanner sc = new Scanner(System.in);


        System.out.println("Введите текущий час:");
        int res = sc.nextInt(); // get int from console
        if (res >=0 && res <=24)
            System.out.println(res >= 9 && res <= 18 ? "Я на работе" : "Я отдыхаю");
    }
}
