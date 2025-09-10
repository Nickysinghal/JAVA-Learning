public class Armstrong {
    public static void main(String[] args) {
        int n = 5678;
        int arm = 0;
        int temp = n;
        int rem;
        int exp=String.valueOf(n).length();

        while (n != 0) {
            rem = n % 10;

            int value = 1;
            for (int i = 0; i < exp; i++) {
                value *= rem;
            }

            arm+=value;
            n/=10;

        }

        if(temp==arm){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
