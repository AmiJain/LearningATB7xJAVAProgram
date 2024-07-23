package Ex_20072024;

public class Lab023_FizzBuzz {
    public static void main(String[] args) {

        String multipleOf3 = "Fizz";
        String multipleOf5 = "Buzz";
        String multipleOf3_5 =  multipleOf3.concat(multipleOf5);
        //System.out.println(multipleOf3_5);

        System.out.println("The FizzBuzz program execution starts...");

        for(int i = 1; i<=100 ; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(multipleOf3_5);
            }
            else if (i % 3 == 0)
            {
                System.out.println(multipleOf3);
            }
            else if (i % 5 == 0)
            {
                System.out.println(multipleOf5);
            }
            else
            {
                System.out.println(i);
            }

        }

    }
}
