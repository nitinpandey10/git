package pattern;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int rows = sc.nextInt();

        for(i=0; i<rows; i++){
            for(j=rows-i; j>1; j--){
                System.out.print(" ");
            }
            for(j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
