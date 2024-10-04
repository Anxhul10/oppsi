public class Main {
/*
Create a method1 that computes the division operation on two constant
values provided by user. Create another method named method2() that
calls method1() and similarly method3() that calls method2(). In the main()
function call method3() and see the result if exception occurs in method1().
Now create a try and catch block to handle the exception occurred in
method using pre-defined methods of exception. Use printStackTrace() to
see the propagation of the exception.
 */
    public static void method1() {
        int a = 10, b = 0;
        int result = a / b; 
    }

    public static void method2() {
        method1();
    }

    public static void method3() {
        method2();
    }

    public static void main(String[] args) {
        try {
            method3();
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in main:");
            e.printStackTrace(); 
        }
    }
}
