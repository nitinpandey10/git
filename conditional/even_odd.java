package conditional;
import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            if(a%2==0){
                System.out.println("entereed number is even");
            }
            else{
                System.out.println("entered number is odd");
            }
        }


    }
    
}
