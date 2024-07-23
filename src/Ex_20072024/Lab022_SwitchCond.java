package Ex_20072024;

import java.util.Scanner;

public class Lab022_SwitchCond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to check for the vowel and consonant");
        char user_input = sc.next().charAt(0);
        //String user_input = String.valueOf(sc.next().charAt(0));
        // user_input = user_input.toLowerCase();
        switch (user_input) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("It is a Vowel");
                break;
            default:
                System.out.println("It is a consonant");
        }
    }
}