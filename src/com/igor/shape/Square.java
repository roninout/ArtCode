package com.igor.shape;

/**
 * Created by Kovalchuk_A on 19.01.2017.
 */

/*
    1. Создайте абстрактный класс Shape в котором есть дв аабстрактных метода double getPerimetr() и double getArea().
    2. Создайте класс Point в котором есть два свойства double x double y.
    3. Создайте классы которые описывают как минимум 3 геометрические фигуры (они должны быть подклассамиShape),
       при этом они в качестве свойств должны содержать классы Point.
    4. Создайте класс доска. Доска поделена на 4 части в каждуючасть доски можно положить одну из фигур.
       У доски должныбыть методы которые помещают и удаляют фигуру с доски.Также должен быть метод который выводит
       информацию овсех фигурах лежащих на доске и их суммарную площадь.
    5. * Нарисуйте UML диаграмму проекта
 */

public class Square extends Shape {
    private Point point;
    private double a; // сторона квадрата

    // конструктор
    public Square(double a) {
        this.a = a;
        point = new Point(0,0);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
        // возвращает периметр квадрата
    double getPerimetr() {
        return 4.0 * a;
    }

    @Override
        // возвращает площадь квадрата
    double getArea() {
        return Math.pow(a, 2.0);
    }
}
