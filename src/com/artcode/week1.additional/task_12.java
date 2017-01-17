package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
12) Написать программу, которая в зависимости от характера ветра выдает
сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
 */

public class task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите продолжительность разговора:");
        int speed = sc.nextInt();

        if (speed < 1) System.out.println("Безветренная погода");
        if (speed >= 1  && speed <= 4) System.out.println("Слабый");
        if (speed >= 5  && speed <= 10) System.out.println("Умеренный"); // 9 - вызовет глюк программы
        if (speed >= 9  && speed <= 18) System.out.println("Сильный");
        if (speed > 19) System.out.println("Ураганный");
    }
}
