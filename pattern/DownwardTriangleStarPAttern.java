package pattern;
import java.util.Scanner;
public class DownwardTriangleStarPAttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, rows;

        rows = sc.nextInt();

        for(i=rows-1; i>=0; i--){
            for(j=0; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    
}
