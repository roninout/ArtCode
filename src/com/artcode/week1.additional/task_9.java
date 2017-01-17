package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
9) Написать программу вычисления идеального веса пользователя (рост-
100). Выдать рекомендации о необходимости поправиться либо поху-
деть.
 */

public class task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите свой рост в см:");
        double height = sc.nextDouble();
        System.out.println("Введите свой вес в кг:");
        double weight = sc.nextDouble();

        if (height <= 100) System.out.println("Не парься, ты еще ребенок, у тебя все идеально");
        else {
            if (weight == height - 100) System.out.println("У вас идеальный вес");
            else {
                if (weight > height - 100)
                    System.out.println("Вам необходимо сбросить " + (weight - (height - 100)) + " кг.");
                else
                    System.out.println("Вам необходимо набрать " + ((height - 100) - weight) + " кг.");
            }
        }

    }
}
