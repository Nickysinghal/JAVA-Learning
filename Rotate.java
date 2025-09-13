public class Rotate {
    public static void main(String[] args) {
        int n=12345;
        int r=-2;

        
        int len = String.valueOf(n).length();
        //String.valueOf() takes a int and convert into string, then .length() gives length
        if(r<0){
            r=(r%len)+len;
        }
        else{
            r%=len;
        }
        
        int rem= n%((int)(Math.pow(10,r))); //12345% 10*2 =45
        n=n/((int)(Math.pow(10,r)));    //12345 / 10*2 =123
        n=n+(rem*((int)(Math.pow(10,len-r)))); // 45 * (10*3) = 45000 + 123 =45123

        System.out.println(n);


    }
}
