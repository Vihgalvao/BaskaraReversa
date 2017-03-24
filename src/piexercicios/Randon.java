

package piexercicios;

import java.util.Random;
import java.util.Scanner;

public class Randon {
    
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rng = new Random();
        int a,b;
        
        a = 10;      
        
        int i = rng.nextInt(a);
        System.out.println(i);
        
    }
    
}
