public class CountWord {
    public static void main(String[] args) {
        String text = "This is without     system class";
        int c=0;
        // String[] text_split = text.split(" ");
        // //System.out.println(text_split[1]);
   
        // System.out.println("Number of words: " + text_split.length);
        for(int i=0;i<text.length();i++){
            
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' '){
                c++;
            }


        }
        System.out.println(c+1);
    }

 
}
