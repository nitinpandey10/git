package conditional;
import java.util.Scanner;
public class UpperCaseLowerCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char c = sc.nextLine().charAt(0);

            if(c >= 'A' && c <= 'Z'){
                System.out.println("Uppercase");
            }
            else if(c >= 'a' && c <= 'z') {
                System.out.println("lowercase");
            }
            else{
              System.out.println("invalid");
            }
        }
        
    }
    
}
