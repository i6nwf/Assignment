import java.util.Scanner;
public class Q1 {
    public static void inputAllBaseTypes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("Enter a long: ");
        long longValue = scanner.nextLong();
        System.out.println("Enter a byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("Enter a short: ");
        short shortValue = scanner.nextShort();
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Long: " + longValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);

        scanner.close();
    }

    public static void main(String[] args) {
        inputAllBaseTypes();
    }
}

