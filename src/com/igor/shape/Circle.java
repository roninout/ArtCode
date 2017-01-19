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

public class Circle extends Shape {
    private Point point;
    private double radius; // радиус круга

    // конструктор
    public Circle(double radius) {
        this.radius = radius;
        point = new Point(0,0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
        // возвращает периметр круга
    double getPerimetr() {
        return 2.0 * Math.PI * radius;
    }

    @Override
        // возвращает площадь круга
    double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
