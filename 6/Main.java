public class Main {
    /*
    Write a program in java to justify the process of chained exception.
     */
    public static void methodA() throws Exception {
        throw new Exception("Exception from methodA");
    }

    public static void methodB() throws Exception {
        try {
            methodA();
        } catch (Exception e) {
            throw new Exception("Exception from methodB caused by methodA", e);
        }
    }

    public static void main(String[] args) {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause().getMessage());
            e.printStackTrace();
        }
    }
}
