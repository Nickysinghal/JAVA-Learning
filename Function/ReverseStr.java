
public class ReverseStr {
    static void rev(String str){
        if(str.length()==0) return;

        System.out.print(str.charAt(-1));
        rev(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        ReverseStr.rev("ABCDE");

    }
}

//Recurion questions homework 10 questions
