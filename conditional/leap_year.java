package conditional;
import java.util.*;
public class leap_year {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();

            if(year%400==0 && year%100==0 && year%4==0){
                System.out.println("entered year is leap year");
            }
            else{
                System.out.println("entered year is notleap year");
            }
        }
    }
    
}
