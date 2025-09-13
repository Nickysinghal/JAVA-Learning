/*
*************
 ***********
  *********
   *******
    *****
     ***
      *
      
 */
public class InvertedFullPyramid {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int j=2*(n-i)-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
