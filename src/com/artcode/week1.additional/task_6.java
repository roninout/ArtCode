package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
 */

public class task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скорость в км/час:");
        double a = sc.nextDouble();
        System.out.println("Введите растояние в км:");
        double b = sc.nextDouble();

        System.out.println("Вы приедете в пукт назначания за " + b/a + " ч");
    }
}
