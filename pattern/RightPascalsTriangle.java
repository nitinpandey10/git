package pattern;
import java.util.Scanner;
public class RightPascalsTriangle {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j,  rows;
        
        rows = sc.nextInt();
        
       for(i=0; i<=rows-1; i++){
           for(j=0; j<=i; j++){
               System.out.print("*" + " ");
           }
           System.out.println();
       }
       for(i=rows-1; i>=0; i--){
             for(j=0; j<=i-1; j++){
                System.out.print("*" + " ");
        }
        System.out.println();
       }
     }
}     
    

