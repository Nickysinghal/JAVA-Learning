public class SwapNum {
    public static void main(String[] args) {
      int num=12345678;
      int len= String.valueOf(num).length();

      int right = num%10;
      int left = num/(int)(Math.pow(10,len-1));
      int middle = (num/10)%(int)(Math.pow(10,len-2));

      num = right*(int)(Math.pow(10,len-1)) + middle*10 + left;
      System.out.println(num);
    }
}
