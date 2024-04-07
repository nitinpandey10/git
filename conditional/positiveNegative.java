package conditional;
import java.util.Scanner;
public class positiveNegative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          
         int a= sc.nextInt();

         if (a>=0) {
            System.out.println("entered number is positive");
            
         }
         else if(a<0){
            System.out.println("entered number is negative");
         }
         else{
            System.out.println("invalid input");
         }
        

        }

    }
    
}
