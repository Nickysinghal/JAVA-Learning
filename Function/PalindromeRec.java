public class PalindromeRec {
    static boolean palindrome(int n){
        int r = rev(n);
        System.out.println(r);
        if(r==n)
        return true;
        return false;
    }

    static int rev(int num){
        if(num<=0) return 0;
        int rem= num%10;
        return rem + rev(num/10);
    }

    public static void main(String[] args) {
        System.out.println(PalindromeRec.palindrome(1221));
    }
}
