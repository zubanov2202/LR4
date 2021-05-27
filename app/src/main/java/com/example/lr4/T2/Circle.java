package com.example.lr4.T2;

public class Circle extends Shape {

    private double radius;

    public Circle(){
        radius = 5.3;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }


    public double getArea(){
        return 3.14 * radius * radius;
    }

    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString(){
        return "Круг цвета: " + getColor() + ", с радиусом: " + getRadius() + ", площадью: "+ getArea() + ", периметром: "
                + getPerimeter() + ", заполненна:  " + isFilled();
    }
}
