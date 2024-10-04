/*
3- Write a suitable program in java to make the use of throw and throws.
Given one scenario where chained exception is used for the different type
of exception. Also use various methods to print the occurred exception.
 */
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionDemo {
    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age is below 18, not eligible to vote.");
        } else {
            System.out.println("Age is valid for voting.");
        }
    }

    public static void processVoting(int age) {
        try {
            validateAge(age);
        } catch (CustomException e) {
            RuntimeException chainEx = new RuntimeException("Exception in voting process", e);
            throw chainEx;
        }
    }

    public static void main(String[] args) {
        try {
            processVoting(15);
        } catch (Exception e) {
            
            System.out.println("Exception message: " + e.getMessage());
            
            System.out.println("Stack trace:");
            e.printStackTrace();
            
            Throwable cause = e.getCause();
            if (cause != null) {
                System.out.println("Caused by: " + cause.getMessage());
                cause.printStackTrace();
            }
        }
    }
}
