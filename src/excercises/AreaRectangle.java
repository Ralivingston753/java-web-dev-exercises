package excercises;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter length of Rectangle: ");
        length = input.nextDouble();

        System.out.println("Enter in width of rectangle: ");
        width = input.nextDouble();

        area = length * width;
        System.out.println("area of rectangle is " + area);

    }
}

