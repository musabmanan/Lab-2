package edu.ben.lab_1;

import java.awt.*;

public class Circle implements Shape {

    public double pi;
    public double radius;

    public Circle (double pi, double radius) {
//        this.pi = base;
//        this.radius = height;
    }



    @Override
    public Double area() {
        this.pi= pi;
        this.radius = radius;

        double area = pi * (radius*radius);

        return area;
    }
    @Override
    public Double perimeter() {

        this.pi = pi;
        this.radius = radius;

        double perimiter = 2*pi * radius;
        return perimiter;
    }




}
