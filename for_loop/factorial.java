package for_loop;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            int i,n, factorial=1;

             n = sc.nextInt();

            for (i=1;i<=n;i++){
                factorial *=i;

            }
            System.out.println("factorial of the given number is :"+factorial);



        }

    }
    
}
