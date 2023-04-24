public class Methods {

    public static void main(String[] args) {
        printHello();

        printHelloWithName("Ivo");

        int sumOfTwoNumbers = sum(1, 2);
        System.out.println("Sum of 1 and 2 is: " + sumOfTwoNumbers);
    }

    // Procedure, sub-program
    static void printHello() {
        System.out.println("Hello world");
    }

    static void printHelloWithName(String name) {
        System.out.println("Hello " + name);
    }

    static int sum(int a, int b) {
        System.out.println("Calling sum with " + a + " " + b);
        final int sum = a + b;
        return sum(a + 1, b + 1);
    }
}
