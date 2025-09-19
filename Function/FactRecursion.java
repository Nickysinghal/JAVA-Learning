

public class FactRecursion {
    static int factRecursion(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factRecursion(n-1);
    }

    public static void main(String[] args) {
        System.out.println(FactRecursion.factRecursion(5));
    }
}
