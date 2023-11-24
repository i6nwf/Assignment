public class Q4 {
    public static int sumPositiveIntegers(int n) {
        if (n <= 0) {
            return 0;
        }
        return (n * (n + 1)) / 2;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sum of positive integers less than or equal to "
                + n + ": " + sumPositiveIntegers(n));
    }
}
