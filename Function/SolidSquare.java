

public class SolidSquare {
    static void col(int colCount){
        if(colCount<=0){
            return;
        }
        System.out.print("*");
        col(colCount-1);
    }

    static void row(int n,int col){
        if(n<=0){
            return;
        }
        System.out.println();
        row(n-1,col);
    }

    static void printSolidSq(int row, int col){
        if(row<=0) return;
        col(col);
        System.out.println();
        printSolidSq(row-1,col);
    }

    //SRP - single responsibility principle
    // Each method should have a single responsibility

    public static void main(String[] args) {
        SolidSquare.printSolidSq(5,10);
    }


}
 

 /*
public class SolidSquare {
    static void col(int colCount){
        if(colCount<=0){
            return;
        }
        System.out.print("*");

        col(colCount-1);
    }

    static void row(int rowCount, int colCount){
        if(rowCount<=0){
            return;
        }
        col(colCount);
        System.out.println();
        row(rowCount-1, colCount);
    }

    static void printSolidSq(int row){
        row(row, row);
    }

    //SRP - single responsibility principle
    // Each method should have a single responsibility
    public static void main(String[] args) {
        SolidSquare.printSolidSq(5);
    }


}

*/
