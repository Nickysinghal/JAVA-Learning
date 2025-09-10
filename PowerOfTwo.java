public class PowerOfTwo {
    public static void main(String[] args) {
        int base =2;
        int exp=8;

        int value=1;
        for(int i=0;i<exp;i++){
            value*=base;
        }

        System.out.println(value);

    }
}
