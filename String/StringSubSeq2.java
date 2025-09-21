package String;
public class StringSubSeq2{
    static boolean isSubsequence(String s, String t) {
        // int a=0;
        // int b=0;
        int a, b;
        if (s.length() > t.length()) return false;
        if (s.length() == 0) return true;

        for (a = 0, b = 0; a < s.length() && b < t.length(); b++) {
            // while(a<s.length() && b<t.length()){
            if (s.charAt(a) == t.charAt(b)) {
                a++;
            }
        
        }

        return (a == s.length());
    }

    public static void main(String[] args) {
        System.out.println(StringSubSeq2.isSubsequence("abc", "ahbgdc"));
    }
}
