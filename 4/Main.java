import java.util.Scanner;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidRectangleException extends Exception {
    public InvalidRectangleException(String message) {
        super(message);
    }
}

public class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void checkRectangleDimensions(double length, double width) throws InvalidRectangleException {
        if (length <= 0 || width <= 0) {
            throw new InvalidRectangleException("Length and width must be positive numbers.");
        } else {
            System.out.println("Area of rectangle: " + (length * width));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            checkAge(age);

            System.out.println("Enter length and width of the rectangle:");
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            checkRectangleDimensions(length, width);

        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } 
        catch(InvalidRectangleException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this finally block always executess");
            sc.close();
        }
    }
}
