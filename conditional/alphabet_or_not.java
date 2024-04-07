package conditional;
import java.util.Scanner;
public class alphabet_or_not {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char a = sc.nextLine().charAt(0);

            if((a >= 'A' && a <= 'Z')||(a >= 'a' && a <= 'z')){
                System.out.println(" entered character is  alphabet ");
            }
            else{
                System.out.println(" not alphabet ");
            }
        }
    }
    
}
