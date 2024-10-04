/*
The nested try block can handle multiple try and catch block along with
finally stuffed within each other. Write a suitable program for the
mentioned scenario.
*/
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("parent try block.");
            try {
                System.out.println("Inner try block 1.");
                int result = 10 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("cant divide by zero");
            } finally {
                System.out.println("Finally block in inner try 1.");
            }

            try {
                System.out.println("Inner try block 2.");
                int[] arr = new int[2];
                System.out.println(arr[5]); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("index out of bounds");
            } finally {
                System.out.println("Finally block in inner try 2.");
            }
        } catch (Exception e) {
            System.out.println("Caught exception in parent try block.");
        } finally {
            System.out.println("Finally block in parent try.");
        }
    }
}
