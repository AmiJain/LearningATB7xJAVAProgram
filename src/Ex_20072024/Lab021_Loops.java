package Ex_20072024;

import java.util.Scanner;

public class Lab021_Loops {
    public static void main(String[] args) {
        // take the character values and tell the user if it is a vowel or consonant

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to check for the vowel and consonant");
        char user_input = sc.next().charAt(0);
        //String user_input = String.valueOf(sc.next().charAt(0));
       // user_input = user_input.toLowerCase();
        switch (user_input){
            case 'a':
                System.out.println("It is a Vowel");
                break;
            case 'e':
                System.out.println("It is a Vowel");
                break;
            case 'i':
                System.out.println("It is a Vowel");
                break;
            case 'o':
                System.out.println("It is a Vowel");
                break;
            case 'u':
                System.out.println("It is a Vowel");
                break;
            default:
                System.out.println("It is a consonant");

        }



    }
}
