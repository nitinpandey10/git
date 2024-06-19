package pattern;
import java.util.Scanner;
public class numberPAttern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,rows;

        rows = sc.nextInt();

        for(i=1; i<=rows; i++){
            for(j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
