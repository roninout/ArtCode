package com.igor.shape;

/**
 * Created by Kovalchuk_A on 19.01.2017.
 */

// точка входа

public class MainProgram {
    public static void main(String[] args) {
        // создаем фигуры
        Square square = new Square(5);
        Triangle triangle = new Triangle(5,6,7,4);
        Circle circle = new Circle(7);

        // создаем доску
        Desk desk = new Desk();

        // раставляем фигуры на доске
        desk.setShape(0,0, triangle);
        desk.setShape(0,1, circle);
        desk.setShape(1,1, square);

        // отображаем доску и общую площадь
        desk.showDesk();

        // удаляем фигуру
        desk.removeShape(0,0);

        // отображаем доску и общую площадь
        desk.showDesk();

        // добавляем фигуру в занятое место
        desk.setShape(0,1,triangle);

        // отображаем доску и общую площадь
        desk.showDesk();

        // добавляем фигуру
        desk.setShape(1,0,circle);

        // отображаем доску и общую площадь
        desk.showDesk();
    }
}
