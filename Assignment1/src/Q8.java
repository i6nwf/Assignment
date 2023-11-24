public class Q8 {
    public static int count(String w ) {
        int c = 0;
        String v = "aeouiAEOUI";
        for (int i = 0; i < w.length(); i++) {
            if (v.indexOf(w.charAt(i)) != -1) {
                c++;
            }
        }
return c;
    }
    public static void main(String[] args) {
        String test="Hi My Name is Nouf";
        int count1=count(test);
        System.out.println(count1);
    }
}
