package Ex_13072024;

public class Ex011_Strings {
    public static void main(String[] args) {
        String name = "Ami"; // Stored in String Constant Pool(SCP) in JVM
        String name0 = "Ami"; //name,name0 are pointing to the same memory location.Total 2 memory is created.
        String name1 = "Jain";

        String name2 = new String("Ami"); // Stored in the heap area as object in JVM.
        String name3 = new String("Jain");
        String name4 = new String("JAIN"); // name3,name4 are two different memory locations.
        // 3 memories is created in heap area.

        System.out.println(name == name0);
        System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name1 == name3);

        System.out.println(name.equals(name0));//True
        System.out.println(name.equals(name2));//True
        System.out.println(name3.equals(name4));//False
        System.out.println(name1.equals(name3));//True
        System.out.println(name1.equalsIgnoreCase(name4));//True
    }
}
