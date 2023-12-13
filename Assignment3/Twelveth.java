import java.util.Random;

public class Twelveth {
//Write a method, shuffle(A), that rearranges the elements
// of array A so that every possible ordering is equally likely.
//You may rely on the nextInt(n) method of the java.util.Random class,
//which returns a random number between 0 and n−1 inclusive.

        public static void shuffle(int[] A) {
            Random random = new Random();

            for (int i = A.length - 1; i > 0; i--) {
                int index = random.nextInt(i + 1);
                int temp = A[index];
                A[index] = A[i];
                A[i] = temp;
            }
        }
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};

            System.out.println("Original array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            shuffle(array);

            System.out.println("Shuffled array:");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

