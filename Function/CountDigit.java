public class CountDigit {
    static int countDigit(int n){
        if(n<=0) return 0;
        return 1+countDigit(n/10);
    }
    public static void main(String[] args) {
        System.out.println(CountDigit.countDigit(12345));
    }
}
