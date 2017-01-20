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

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
