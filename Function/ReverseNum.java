public class ReverseNum {
    static void revNum(int n){
        if(n==0) 
        return ;
        System.out.print(n%10);
        revNum(n/10);

    }

    public static void main(String[] args) {
        ReverseNum.revNum(12345);
    }
}
