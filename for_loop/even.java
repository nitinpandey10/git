package for_loop;
import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        int i, number ;
        Scanner sc = new Scanner(System.in);
        
        number=sc.nextInt();

        for(i=1;i<=number;i++){
            if (i%2==0) {
                System.out.println(i);
                
            }
            
        }


        
    }
    
}
