import java.util.*;
public class CountWord {
    public static void main(String[] args) {
       // String text = "";
        //int c = 0;
        // String[] text_split = text.split(" ");
        // //System.out.println(text_split[1]);

        // System.out.println("Number of words: " + text_split.length);

        Scanner sc = new Scanner("my name      is nicky\n hi  \n uijhi");
        int wordCount = 0;

        while(sc.hasNext()){
            wordCount++;
            sc.next();
        }

        System.out.println(wordCount);
        
        sc.close();

       /*  text.trim();
        if (text.length() != 0) {
            for (int i = 0; i < text.length(); i++) {

                if (text.charAt(i) == ' ' && text.charAt(i + 1) != ' ') {
                    c++;
                }

            }
            System.out.println("count" + (c + 1));
        } else {
            System.out.println("empty string");
        }
            */

    }

}
