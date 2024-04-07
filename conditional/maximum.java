package conditional;
import java.util.*;
public class maximum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
             int b= sc.nextInt();
             int c= sc.nextInt();

 //if two numbers are given

            if(a>b){
                System.out.println("A is geater then B");
            }
             else if(a==b){
                System.out.println("both are equal");
            }
            else{
                System.out.println("B is greatre than A");
            }

// if three numbers are given
            if(a>b && a>c){
                System.out.println("A is greater");
            }
            else if (b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println(" c is greater");
            }
        }
    }
    
}
