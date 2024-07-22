package Ex_13072024;

public class Ex009_TypeCasting {
    public static void main(String[] args) {
        // Type casting is source to destination conversion.
        // Two types of type castings are: 1) Implicit 2) Explicit
        // Implicit : It is done automatically by the compiler.
        // Explicit: It is done by us explicitly in the code.

// Widening concept (both implicit and explicit (Lossless) can be done)
        Byte b = 10;
        int a = b; //implicit type casting
        int c = (int)b; //Explicit type casting
        System.out.println(a);
        System.out.println(c);

// Narrowing concept (both implicit and explicit (Loss) can be done)
        double d = 30;
        int i = (int)d;
        System.out.println(i);

        int i1 = 300;
        byte b1 = (byte)i1;
        System.out.println(b1); // Result is 44 as the data gets lost. Byte max size is 128; thus cannot store 300.

    }
}
