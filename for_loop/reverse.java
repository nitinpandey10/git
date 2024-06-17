package for_loop;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args){
       try(Scanner sc = new Scanner(System.in)){
    int number , reverse = 0;  
        System.out.println("Enter the number yu want to reverse ");
    number=sc.nextInt();
    while(number != 0)   
    {  
    int remainder = number % 10;  
    reverse = reverse * 10 + remainder;  
    number = number/10;  
    }  
     System.out.println("The reverse of the given number is: " + reverse);  
    }   
}  
}  
    

