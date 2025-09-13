/*
      *
     ***
    *****
   *******
  *********
 ***********
*************

 */
public class FullPyramid {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
            //space
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }

            //star
            for(int j=2*i+1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
