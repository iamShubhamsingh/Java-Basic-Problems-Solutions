public class Main {
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 9;

        // Q: Store a person's name
        String name = "Shubham Singh";

        // Q: Store 3 roll numbers.
        int rno1 = 11;
        int rno2 = 22;
        int rno3 = 33;

        // Syntax
        // datatype[] variable_name = new datatype[size];
//        int[] rno = new int[5];
        // or directly
//        int[] rnos = {23, 12, 45, 32, 15};

        int[] ros; // declaration of array. ros  is getting defined in the stack.
        ros = new int[5]; // initialisation: actually here the object is being created in the Heap Memory.
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}