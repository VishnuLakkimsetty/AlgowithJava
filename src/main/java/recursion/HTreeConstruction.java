// H -Tree construction

/*
 * For more info on the question visit my article in GFG - 
 */

package main.java.recursion;

public class HTreeConstruction {
	public static void main(String[] args) {
		drawHTree(0,0,8,2);
	}
	public static void drawHTree(double x, double y, double length, double depth ){

		if(depth==0) return; //Base case

		double x0 = x+length/2;  // Positive X-axis bound
		double y0 = y+length/2;  // Positive Y-axis bound
		double x1 = x-length/2;  // Negative X-axis bound
		double y1 = y-length/2;  // Negative Y-axis bound

		drawLine(x1,y,x0,y); // Horizontal
		drawLine(x1,y0,x1,y1); // Left Vertical
		drawLine(x0,y0,x0,y1); // Right Vertical

		double newLength = length/Math.sqrt(2);

		drawHTree(x0,y0,newLength,depth-1); 

		drawHTree(x0,y1,newLength,depth-1);

		drawHTree(x1,y0,newLength,depth-1);

		drawHTree(x1,y1,newLength,depth-1); 
	}

	public static void drawLine(double x1, double y1, double x2, double y2) {
		System.out.println("Line is drawn by the point: " + "(" + x1 + "," + y1 + ") " + "and " + "(" + x2 + "," + y2 + ")");
	}

}
