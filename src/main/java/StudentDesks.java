import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int c1s = scanner.nextInt();
        int c2s = scanner.nextInt();
        int c3s = scanner.nextInt();
        /*
         *  your code goes here
         */
         int c1d = c1s%2 + c1s/2;
         int c2d = c2s%2 + c2s/2;
         int c3d = c3s%2 + c3s/2;
         int totalDesks = c1d + c2d + c3d;

         System.out.println(totalDesks);


          // closing the scanner object
        scanner.close();
    }
}