package com.example.lr4;

import com.example.lr4.T2.Circle;
import com.example.lr4.T2.Rectangle;
import com.example.lr4.T2.Shape;
import com.example.lr4.T2.Square;

import org.junit.Test;

public class Test2 {
    @Test
    public void TestShape(){

        Shape s1 = new Shape();
        System.out.println("S1 = " + s1);

        Circle c1 = new Circle();
        System.out.println("C1 = " + c1);

        Rectangle r1 = new Rectangle();
        System.out.println("R1: " + r1);

        Square square1 = new Square();
        System.out.println("square1 = "+ square1);
    }
}
