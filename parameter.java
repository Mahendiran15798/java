import java.util.Scanner;

import static java.lang.Math.*;

public class parameter{

    private static final double radius = 7.5;

    public static void main(String[] args) {
        Scanner Input =new Scanner(System.in);
        System.out.println("enter the value");
        int permeter =Input.nextInt();

        double perimeter = 2 * PI * radius;
        double area = PI* radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}