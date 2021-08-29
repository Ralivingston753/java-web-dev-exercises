package excercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main( String[] args){
        double mile;
        double gas;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Amount of miles driven: ");
        mile = input.nextDouble();

        System.out.println("Amount of gas in gallons: ");
        gas = input.nextDouble();

        mpg = mile/gas;
        System.out.println("Miles-per-gallon: " + mpg);
    }
}
