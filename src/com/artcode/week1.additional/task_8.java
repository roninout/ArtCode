package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
8) Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
тавляется, если сумма покупки превышает 1000 гривен.
 */
public class task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стоимость покупки:");
        int a = sc.nextInt();

        if (a > 1000)
            System.out.println("Ваша скидка составляет " + (double)a/10 + " грн. Стоимость со скидкой " + ((double)a - (double)a/10) + " грн.");
        else
            System.out.println("Вам не предоставляется скидка, стоимость составляет " + a + " грн.");
    }
}
