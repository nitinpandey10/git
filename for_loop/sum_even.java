package for_loop;
import java.util.Scanner;
public class sum_even {
    public static void main(String[] args) {
        int i, number, sum=0 ;
       try(Scanner sc = new Scanner(System.in)){
        
        number=sc.nextInt();

        for(i=1;i<=number;i++){
            if (i%2 ==0) {
                
                sum=sum+i;
            }
            
        }
        System.out.println("sum of all even numbers:"+sum);

        }
        
    }
    
}
