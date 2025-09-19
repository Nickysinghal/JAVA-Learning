public class RevString {
    String rev(String s){
        if(s.length()==0)
        return;

        return s.charAt(-1)+rev()
    }
}
