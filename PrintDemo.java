//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
//import java.util.Scanner;

//printing without using 'System' keyword
// public class PrintDemo {
//     public static void main(String[] args) throws FileNotFoundException {
//         PrintStream out = new PrintStream("D:\\nicky\\JAVA training\\output.txt");
//         //PrintStream out= null; //error
//         out.println("hello world");
//         out.close();
//     }
// }

// changing the default output stream
public class PrintDemo {
    public static void main(String[] args) throws FileNotFoundException{
         
        System.setOut(new PrintStream("D:\\nicky\\JAVA training\\output.txt"));

        System.out.println("hello every one");
        System.out.close();
    }
}

/*
public class PrintDemo{
    public static void main(String[] args) throws FileNotFoundException{
        System.setIn(new FileInputStream("D:\\nicky\\JAVA training\\input.txt"));

        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(text);

    }
}
*/
