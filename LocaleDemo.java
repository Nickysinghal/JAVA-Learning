import java.util.Scanner;
import java.util.Locale;
import java.util.ResourceBundle;

//multilingual program

public class LocaleDemo {
    static Locale locale;
    static ResourceBundle rb;
    static void loadFiles(Locale locale){
        
        rb=ResourceBundle.getBundle("resource",locale);
    }
    static String getDataFromFile(String key){
        return rb.getString(key);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please press 1 for English");
        System.out.println("कृपया हिंदी के लिए 2 दबाएँ");
        System.out.println("Veuillez appuyer sur 3 pour le français");

        int langChoice = sc.nextInt();

       
        if(langChoice==1){
            locale = new Locale("en", "US");
            
        }
        if(langChoice==2){
            locale = new Locale("hi", "IN");
        }
        if(langChoice==3){
            locale = new Locale("fr", "FR");
        }
    
        loadFiles(locale);
        System.out.println(getDataFromFile("ASK_NAME"));
    }
}
