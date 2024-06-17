package pattern;
import java.util.Scanner;
public class LeftStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
            
            int i, j;
            int rows = sc.nextInt();
            
            for(i=1; i<=rows; i++){
                for(j=2*(rows-i); j>=0; j--){
                    
                    System.out.print(" ");
                }
                for(j=1; j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
                
            }
          
        }
        
        
        



}   

    