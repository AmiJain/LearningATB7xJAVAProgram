package Ex_20072024;

import java.util.Scanner;

public class Lab019_Loops {
    public static void main(String[] args) {

        String triangle_type = null;

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of first side of triangle");
        int side1 = sc.nextInt();
        System.out.println("Enter the length of second side of triangle");
        int side2 = sc.nextInt();
        System.out.println("Enter the length of third side of triangle");
        int side3 = sc.nextInt();

        if (side1 == side2 && side2 == side3)
        {
            triangle_type = "Equilateral";
        }
        else if (side1 == side2 || side2 == side3 || side3 == side1 )
        {
            triangle_type = "isosceles";
        }
        else
        {
            triangle_type = "Scalene";
        }
        System.out.println("The triangle is " +triangle_type+ " triangle");
    }
}
