package conditional;
import java.util.*;
public class divisiblity {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();


   //divisible by 3 or not     
            if(a%3==0){
                System.out.println("Entered number is divisible by 3");
            }
            else{
                System.out.println("entered number is not divisible by 3");
            }

   //divisble by 5 or not   
      
             if(a%5==0){
                System.out.println("Entered number is divisible by 5");
            }
            else{
                System.out.println("entered number is not divisible by 5");
            }

   //diviible by eleven or not 
   
             if(a%11==0){
                System.out.println("Entered number is divisible by 11");
            }
            else{
                System.out.println("entered number is not divisible by 11");
            }
        }

 


    }
    
}
