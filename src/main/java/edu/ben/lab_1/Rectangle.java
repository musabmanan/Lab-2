package edu.ben.lab_1;

import java.awt.*;

public class Rectangle implements Shape {

    public double base;
    public double height;

    public Rectangle (double base, double height) {
       this.base = base;
       this.height = height;
    }
    @Override
    public Double area () {
        this.base = base;
        this.height = height;

        double area = base *height;

        return area;
    }
    @Override
    public Double perimeter() {

        this.base = base;
        this.height = height;

        double perimiter = 2 * (base+height) ;
        return perimiter;
    }





}



