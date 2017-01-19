package com.artcode.week1.additional;

import java.util.Scanner;

/**
 * Created by Kovalchuk_A on 16.01.2017.
 */

/*
15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
квадрат; б) уместится ли квадрат в круге.
 */

public class task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите площадь круга:");
        int Ploschad_Kr = sc.nextInt();
        System.out.println("Введите площадь квадрата:");
        int Ploschad_Kv = sc.nextInt();

        double Radius_Kr = Math.sqrt(Ploschad_Kr/Math.PI);
        double Diametr_Kr = Radius_Kr + Radius_Kr;

        double Storona_Kv = Math.sqrt(Ploschad_Kv);
        double Dioganal_Kv = Math.sqrt(Math.pow(Storona_Kv,2.0) + Math.pow(Storona_Kv,2.0));

        System.out.println(Dioganal_Kv >= Radius_Kr ? "Квадрат вписывается в круг" : "Квадрат не вписывается в круг");
        System.out.println(Diametr_Kr <= Storona_Kv ? "Круг вписывается в квадрат" : "Круг не вписывается в квадрат");
    }
}
