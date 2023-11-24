public class Q5 {
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }

    public static void main(String[] args) {
        int number = 6;
        System.out.println("Is " + number + " even? " + isEven(number));  // Output: true
    }
}
