
package characterstream2;

import java.util.Scanner;


public class LAB5 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String name = s.nextLine();
        System.out.println("Hello " + name);
        
        System.out.print("Enter you weight: ");
        double w = s.nextDouble();
        System.out.print("Enter you height: ");
        double h = s.nextDouble();
        System.out.println(w*h);
        
    }
    
}
