public class PowerRec {
    static int power(int n,int p){
        if(p==0){
            return 1;
        }
        return n*power(n, p-1);
    }

    public static void main(String[] args) {
        int n=2;
        int p = 5;
        System.out.println(PowerRec.power(n, p));
    }
}
