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
        desk.setShape(0,0, triangle);
        desk.setShape(1,0, circle);
        desk.setShape(1,1, square);

    }
}
