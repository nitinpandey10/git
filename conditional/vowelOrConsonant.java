package conditional;

import java.util.Scanner;

public class vowelOrConsonant {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char c = sc.nextLine().charAt(0);

            if( c == 'A' && c=='E' &&c=='I'&&c=='O'&&c=='U'&&c=='a'&& c=='e'&&c=='i'&&c=='o'&&c=='u'){
                System.out.println("vowel");
            }
            else{
                System.out.println("Consonant");
            }
            
           
        }
        
    }
    
}
