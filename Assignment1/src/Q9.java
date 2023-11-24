public class Q9 {
    public static String punctuationCount(String s){
StringBuilder stringBuilder=new StringBuilder();
String p="?.!@#$%^&*()_-+={}|\"'><,./;:`~";
for (int i =0;i<s.length();i++){
    char n=s.charAt(i);
    if (p.indexOf(n)==-1){
        stringBuilder.append(n);
    }
}
return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "life's good!!";
        String r=punctuationCount(s);
        System.out.println(r);
    }
}
