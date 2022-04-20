public class printSubString {

public static void subString(String str) {
    int n = str.length();
    for (int i = 0; i < n; ++i) {
        for (int j = i; j < n; ++j) {
         for (int k = i; k <=j; ++k) {
             System.out.println(str.charAt(k));
         }   
            System.out.println();
        }
    }
    
}
    public static void main(String[] args) {
        String str = "pqrs";
        subString(str);
    }
    
}
