import java.util.Scanner;
public class Array_Input {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter 5 elements : ");
        String[] names=new String[5];
        for (int i = 0 ; i<5 ; i++){
            names[i]=s.nextLine();
        }
    }
}
