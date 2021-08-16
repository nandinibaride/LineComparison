package linecomparison.com;

public class CalculateLength {
	public static void main(String args[]) {
		int x1 = 4 , x2 = 5 , y1 = 6 , y2 = 8;
		double calculatelength = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("length is " + calculatelength);
	}
}
