package String;

import java.util.ArrayList;

public class StringSubSeq {
    public static void main(String[] args) {
        String str = "ABC";
        int len = str.length();
        ArrayList <String> arr = new ArrayList<>();

        for(int i=0;i<len;i++){
            char ch = str.charAt(i); //A B C
            
            if(arr.isEmpty()){
                arr.add("");
                arr.add(ch+""); //add first element abd convert it into string
                continue;   //so that next things will be done for B
            }

            int listSize = arr.size();
            for(int j=0;j<listSize;j++){ 
                String temp = arr.get(j)+ch;

                arr.add(temp);

            }
        }
        System.out.println(arr);
    }
}
