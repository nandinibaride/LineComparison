
package linecomparison.com;
import java.util.*;
public class CalculateLength {
	public static void main(String args[]) {
       Scanner sc= new Scanner(System.in);     
		System.out.print("Enter x1  ");  
		int x1 = sc.nextInt();  
		System.out.print("Enter y1 ");  
		int y1 = sc.nextInt();  
		System.out.print("Enter x2 ");  
		int x2 = sc.nextInt();  
		System.out.print("Enter y2 ");  
		int y2 = sc.nextInt();
		double calculatelength = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length is " + calculatelength);
	}
}
