package Ex_13072024;

public class Ex010_Strings {
    public static void main(String[] args) {
        String name = "Ami"; // Stored in String Constant Pool(SCP) in JVM
        String name0 = "Ami"; //name,name0 are pointing to the same memory location.Total 2 memory is created.
        String name1 = "Jain";

        String name2 = new String("Ami"); // Stored in the heap area as object in JVM.
        String name3 = new String("Jain");
        String name4 = new String("Jain"); // name3,name4 are two different memory locations.
        // 3 memories is created in heap area.



    }
}
