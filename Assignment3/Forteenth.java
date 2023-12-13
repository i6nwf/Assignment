public class Forteenth {
//Write a Java method that takes two three-dimensional integer arrays and
// adds them componentwise.
public class ThreeDArrayAddition {
    public static int[][][] addThreeDArrays(int[][][] array1, int[][][] array2) {
        int xSize = array1.length;
        int ySize = array1[0].length;
        int zSize = array1[0][0].length;

        int[][][] resultArray = new int[xSize][ySize][zSize];

        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                for (int k = 0; k < zSize; k++) {
                    resultArray[i][j][k] = array1[i][j][k] + array2[i][j][k];
                }
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[][][] array1 = {
                {{1, 2}, {3, 4}},
                {{5, 6}, {7, 8}}
        };

        int[][][] array2 = {
                {{10, 20}, {30, 40}},
                {{50, 60}, {70, 80}}
        };

        int[][][] result = addThreeDArrays(array1, array2);

        for (int[][] arr : result) {
            for (int[] row : arr) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
}
