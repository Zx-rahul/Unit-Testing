package org.example.services;

public class ComputeArea {

    public static double square(double side) {
        return side*side;
    }

    public static double circle(double radius) {
        return (Math.PI*radius*radius)/2;
    }
}
