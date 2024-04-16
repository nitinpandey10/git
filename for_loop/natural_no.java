package for_loop;

import java.util.Scanner;
class natural_no{
    public static void main(String[] args) {
        int i,number;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any number");
             number =sc.nextInt();
        }
         for(i=1; i<=number;i++){
            System.out.println(i);
         }

        
    }
}