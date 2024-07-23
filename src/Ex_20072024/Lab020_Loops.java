package Ex_20072024;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Lab020_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser you want to run");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome browser....");
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser....");
                break;
            case "edge":
                System.out.println("Starting the Edge browser....");
                break;
            default:
                System.out.println("Browser not recognized!!!");
                break;
        }

        }



    }
