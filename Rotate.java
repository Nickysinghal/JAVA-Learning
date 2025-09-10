public class Rotate {
    public static void main(String[] args) {
        int n=12345;
        int r=-2;

        
        int len = String.valueOf(n).length();
        if(r<0){
            r=(r%len)+len;
        }
        else{
            r%=len;
        }
        
        int rem= n%((int)(Math.pow(10,r)));
        n=n/((int)(Math.pow(10,r)));
        n=n+(rem*((int)(Math.pow(10,len-r))));

        System.out.println(n);

        /*while(r>0){
            int rem=n%10;

            value =rem*;

            r--;
           // n/=10;
            
            //len--;
           // n=value;
            value=value+ (n/10);
            n=value;
            System.out.println(value);
            len--;
        }
        //
        //System.out.println(value);
        */

    }
}
