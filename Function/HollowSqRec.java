
//row=column
/*

public class HollowSq {
    static void colPrint(int row,int n,int col){
        if(col<=0) return;
        if(col==n||col==1||row==1||row==n)
        System.out.print("* ");
        else 
        System.out.print("  ");
        colPrint(row,n,col-1);

    }

    static void row(int row,int col,int n){
        if(row<=0) return;
        colPrint(row, n,col);
        System.out.println();
        row(row-1,col,n);
    }

    static void hollowSq(int row){
        row(row,row,row);
    }

    public static void main(String[] args) {
        HollowSq.hollowSq(5);
    }
}
    */

/* 
public class HollowSq {
    static void colPrint(int row,int col,int rowlast, int colLast){
        if(col<=0) return;
        if(col==colLast||col==1||row==1||row==rowlast)
        System.out.print("*");
        else 
        System.out.print(" ");
        colPrint(row,col-1,rowlast,colLast);

    }

    static void row(int row,int col,int rowlast , int colLast){
        if(row<=0) return;
        colPrint(row,col,rowlast,colLast);
        System.out.println();
        row(row-1,col,rowlast,colLast);
    }

    static void hollowSq(int row,int col){
        row(row,col,row,col);
    }

    public static void main(String[] args) {
        HollowSq.hollowSq(5,15);
    }
}
*/

import java.util.Scanner;

public class HollowSqRec {
    static int rowCount;
    static int colCount;

    static void printStar(int starCount, int row) {
        if (starCount <= 0) {
            return;
        }
        if (row == 1 || row == rowCount || starCount == colCount || starCount == 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }

        printStar(starCount - 1, row);
    }

    static void printHollowSq(int row, int col) {
        if (row <= 0) {
            return;
        }
        printStar(col, row);
        System.out.println();
        printHollowSq(row - 1, col);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter rows");
        rowCount = sc.nextInt();
        System.out.println("Please enter col");
        colCount = sc.nextInt();
        HollowSqRec.printHollowSq(rowCount, colCount);
        sc.close();
    }
}