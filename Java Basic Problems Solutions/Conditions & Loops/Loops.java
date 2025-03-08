public class Loops {
    public static void main(String[] args) {
        /*
        *   Syntax of for loops:
        *
        *   for (initialisation; condition; increment/decrement) {
        *       //body
        *   }
        *
        */

        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 1) {
//            System.out.println(num);
//        }

        /*
         *   Syntax of while loops:
         *
         *   while (condition) {
         *       //body
         *   }
         *
         */

        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num += 1;
        }

        /*
         *   Syntax of do-while loops:
         *
         *   do {
         *       //body
         *   } while (condition);
         *
         */

        int num1 = 1;
        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= 5);

    }
}
