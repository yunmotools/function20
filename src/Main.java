// **Fibonacci Sequence**
// Write a function with parameter `int n`, returning the nth term of Fibonacci sequence.

public class Main {
    public static int fib(int n) {
        // Base cases
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Recursive case:
        // fib(n) = fib(n - 1) + fib(n - 2)
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {

        int terms = 10; // how many Fibonacci numbers you want

        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");

        }

    }
}
