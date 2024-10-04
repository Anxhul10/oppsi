public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block.");
            try {
                System.out.println("Inner try block 1.");
                int result = 10 / 0; // This will cause ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } finally {
                System.out.println("Finally block in inner try 1.");
            }

            try {
                System.out.println("Inner try block 2.");
                int[] arr = new int[2];
                System.out.println(arr[5]); // This will cause ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } finally {
                System.out.println("Finally block in inner try 2.");
            }
        } catch (Exception e) {
            System.out.println("Caught exception in outer try block.");
        } finally {
            System.out.println("Finally block in outer try.");
        }
    }
}
