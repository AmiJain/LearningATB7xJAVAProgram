package Ex_13072024;

public class Lab007 {
    public static void main(String[] args) {
        int a = 10;
//        System.out.println(++a + a); Ex = 11, a = 11 (Result is 22; Value of a is 11)

        System.out.println(++a + a + a++); //Ex = 11 + 11 + 11, a = 12 (Result is 33; Value of a is 12)
        System.out.println(a);

    }
}
