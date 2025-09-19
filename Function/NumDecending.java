public class NumDecending{
    static void num(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        num(n - 1);
    }
    //Important Topic - call stack

    public static void main(String[] args) {
        NumDecending.num(5);
    }
}