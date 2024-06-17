package for_loop;
import java.util.Scanner;
public class base_power {
    


    public static void main(String[] args)
    {
       try( Scanner console = new Scanner(System.in)){
     
        int base;
        int power;
        int result = 1;
        
        System.out.print("Enter the base number ");
        base = console.nextInt();
        
        System.out.print("Enter the power ");
        power = console.nextInt();

        for(int i = 1; i <= power; i++)
        {
	    result *= base;
        }

        System.out.println("Result: "+ result);
         }
    }
}
    

