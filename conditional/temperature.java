package conditional;
import java.util.Scanner;
public class temperature {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

    //celsius to farenhite   
      
          double celsius = sc.nextInt();

         double farenhite =((celsius*1.8)+32);
         System.out.println(farenhite);


    //farenhite to celsius    

         double farenhitee = sc.nextInt();

         double celsiuss = ((farenhite-32)*5/9);
         System.out.println(celsius);

    }
    
}
