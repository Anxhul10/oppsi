import java.util.Scanner;
/*
Consider an array that has been initialized by user input. Compute the
division of each adjacent index and use try and catch block to handle if an
exception generates. Also try to access the index that is not part of the array
and handle it using suitable catch block.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        System.out.println();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        
        try {
            for (int i = 0; i < size - 1; i++) {
                try {
                    System.out.println("Division of index " + i + " by index " + (i + 1) + " = " + (arr[i] / arr[i + 1]));
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero at index " + (i + 1));
                }
            }
            System.out.println(arr[size]);  
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an index out of bounds.");
        } finally {
            System.out.println("Program finished.");
        }

        sc.close();
    }
}
