package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double radius;
        double area;
        double pi = Math.PI;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter in radius: ");
        radius = input.nextDouble();

        area = Circle.getArea(radius);
        System.out.println("Area of Circle is: " + area);
    }
}
