public class Sixth {
//  Give three different examples of a single Java statement that
//  assigns variable, backup, to a new array with copies of all
//  int entries of an existing array, original.
//    1. *Using Arrays.copyOf*:
//   java
//   int[] original = {1, 2, 3, 4, 5};
//   int[] backup = Arrays.copyOf(original, original.length);
//
//    2. *Using System.arraycopy*:
//   java
//   int[] original = {1, 2, 3, 4, 5};
//   int[] backup = new int[original.length];
//   System.arraycopy(original, 0, backup, 0, original.length)
//
//   3. Using a for loop*:
//   java
//   int[] original = {1, 2, 3, 4, 5};
//   int[] backup = new int[original.length];
//   for (int i = 0; i < original.length; i++) {
//       backup[i] = original[i];
//   }
}
