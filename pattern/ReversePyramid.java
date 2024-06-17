package pattern;
import java.util.Scanner;
public class ReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k;
        int rows = sc.nextInt();

        for(i=0; i<=rows-1; i++){
            for(j=0; j<=i; j++){
                System.out.print(" ");
            }
            for(k=0; k<=rows-1-i; k++){
                System.out.print("* "+" ");
            }
            System.out.println();
        }

    }
    
}
