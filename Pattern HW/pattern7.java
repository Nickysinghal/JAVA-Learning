public class pattern7 {
  

    public static void main(String[] args) {
        int n = 5;
        printInvertedTriangle(n);
    }

    public static void printInvertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
