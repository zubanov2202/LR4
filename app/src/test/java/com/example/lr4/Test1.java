package com.example.lr4;

import com.example.lr4.T1.Rectangle;
import com.example.lr4.T1.Shape;
import com.example.lr4.T1.Triangle;

import org.junit.Test;

public class Test1 {
    @Test
    public void test() {
        Shape s1 = new Rectangle("Red", 4, 8);
        Shape s2 = new Triangle("green", 5, 3);

        System.out.println(s1);
        System.out.println(s2);

    }
}
