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
       У доски должны быть методы которые помещают и удаляют фигуру с доски.Также должен быть метод который выводит
       информацию овсех фигурах лежащих на доске и их суммарную площадь.
    5. * Нарисуйте UML диаграмму проекта
 */

class Desk {
    // доска с формами
    private Shape[][] desk = new Shape[][]{
            {null, null},
            {null, null}
    };

    // устанавливаем фигуру на доску
    void setShape(int x, int y, Shape form) {
        if (desk[x][y] == null) {
            desk[x][y] = form;
            System.out.println("Фигура " + form.getClass().getSimpleName() + " была успешно установлена");
        }
        else
            System.out.println("Нет возможности установить фигуру, так как это место занято " + desk[x][y].getClass().getSimpleName());
    }

    // удаляем фигуру с доски
    void removeShape(int x, int y) {
        desk[x][y] = null;
        System.out.println("Фигура была успешно удалена");
    }

    // отображаем информацию о фигурах на доске, а также их суммарную площадь
    void showDesk() {
        double Sum = 0.0;
        for (int i = 0; i < desk.length; i++) {
            for (int j = 0; j < desk.length; j++) {
                if (desk[i][j] == null)
                    System.out.print("Empty  ");
                else {
                    System.out.print(desk[i][j].getClass().getSimpleName() + "  ");
                    Sum += desk[i][j].getArea();
                }
            }
            System.out.println();
        }
        System.out.println("Суммарная площадь - " + Math.round(Sum));
        System.out.println();
    }
}