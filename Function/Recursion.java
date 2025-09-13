package Function;

public class Recursion {
    
    static void printData(int n){
        if(n == 10){
            return;
        }
        System.out.println("java");
        printData(n+1);
    }

    public static void main(String[] args) {
    
       Recursion.printData(0);
    }
}
