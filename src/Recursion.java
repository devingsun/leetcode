public class Recursion {
    public static void main(String[] args) {
        int n = 2;

        System.out.printf("\nfactorial(" + n + ") = " + factorial(n));

    }

    public static int factorial(int n) {
        if (n == 1) {
            System.out.printf(n + "");
            return 1;
        } else {
            System.out.printf(n + " x ");
            return n * factorial(n - 1);
        }
    }
}
