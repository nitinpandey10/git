package for_loop;
import java.util.*;
public class table {
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)){

        int i;
        System.out.println("enter the number");
        int  number=sc.nextInt();

        for(i=1; i<=10;i++){
            System.out.println(number+ "*" +i+ "=" +(number*i));
        }
       
    }

    }
    
}
