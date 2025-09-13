package Function;

public class Num {
    static void num(int n){
        if(n == 0){
            return;
        }
        num(n - 1);
        System.out.println(n);
    }
    //Important Topic - call stack

    public static void main(String[] args) {
        Num.num(5);
    }
}
