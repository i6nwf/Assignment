import java.util.Scanner;
public class Method {
    public String[] array;
    public int max;
    public Method(String[] array, int max) {
        this.array = array;
        this.max = max;
    }
public void printArray(){
        for (int i =0;i<max;i++){
            System.out.println(array[i]);
        }
}
public void addElement(){
    Scanner s=new Scanner(System.in);
    System.out.println("enter 5 elements : ");
    for (int i = 0 ; i<5 ; i++){
        array[i]=s.nextLine();
    }
}
}
