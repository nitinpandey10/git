package pattern;
import java.util.Scanner;
public class solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int rows=sc.nextInt();
        int columns= sc.nextInt();


        for(i=1;i<=rows;i++){
            for(j=1;j<=columns;j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    
}
