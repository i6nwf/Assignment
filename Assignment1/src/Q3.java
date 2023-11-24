public class Q3 {
    public static boolean isMultiple(long n, long m) {
        if (m%n!=0) {
            return false;
        }
        return n % m == 0;
    }
}
