package pattern;
import java.util.Scanner;
public class numberPattren3 {
        public static void main(String[] args){  
            try(Scanner sc = new Scanner(System.in)){
     
     
          int n = sc.nextInt();     
         
        for (int i = 0; i < n; i++){  
            int number = 1;  

            System.out.printf("%" + (n - i) * 2 + "s", "");  
         
            for (int j = 0; j <= i; j++){  
                System.out.printf("%4d", number);  
                number = number * (i - j) / (j + 1);  
             }  
            
            System.out.println();  
            }  
    }  
}  
}
                

