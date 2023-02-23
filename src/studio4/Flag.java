package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.GREEN); 
		StdDraw.filledRectangle(.5, .5, .3, .2);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.5, .5, .3, .1);
		StdDraw.setPenColor(Color.PINK); 
		StdDraw.filledCircle(.5, .5, .1);
		
		
		
	}
}