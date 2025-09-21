package String;
public class StringSubSeqOptimized {

    static boolean isSubsequence(String s,String t){
        int pos = -1;  // starting before the beginning
        for (char ch : s.toCharArray()) {
            //int indexOf(int ch, int fromIndex)
            pos = t.indexOf(ch, pos + 1); 
            if (pos == -1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="343";
        String t="";
        System.out.println(StringSubSeqOptimized.isSubsequence(s, t));
        
    }
}
