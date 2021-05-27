package com.example.lr4.T1;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle (String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString(){
        return "Длина прямоугольника: " + length + " Ширина прямоугольника: " + width +
                ", подкласс: " + super.toString() + ", площадь: " + getArea();
    }

    @Override
    public double getArea(){
        return length * width;
    }
}

