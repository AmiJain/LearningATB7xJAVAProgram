package Ex_20072024;

import java.util.Scanner;

public class Lab015_Loops {
    public static void main(String[] args) {
        // Take a user input and check the number is even or odd.
        // Scanner class helps in taking the input from the system.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int user_input = sc.nextInt();

        if(user_input % 2 == 0)
        {
            System.out.println("The entered number " +user_input+ " is Even number");
        }
        else
        {
            System.out.println("The entered number " +user_input+ " is Odd number");
        }
    }
}
