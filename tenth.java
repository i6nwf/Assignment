import java.util.Scanner;
public class tenth {
//    Give an example of a Java code fragment that performs an array reference that is possibly out of bounds,
//    and if it is out of bounds,
//    the program catches that exception and prints the following error message: “Don’t try buffer overflow attacks in Java!”
public static void main(String[] args) {
    int[] x = {2, 3, 22, 33, 222};
    System.out.println("input index to print negative number to exit");
    Scanner input = new Scanner(System.in);
    int y=input.nextInt();
    while (y>=0) {
        try {
            System.out.println(x[y]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Don’t try buffer overflow attacks in Java!");
        }
        y=input.nextInt();
    }
}
}
