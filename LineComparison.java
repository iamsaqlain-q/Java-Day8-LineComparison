package com.bl.linecompare.oops;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
		
		double lengthLine1 = 0.0;
		double lengthLine2 = 0.0;
		
		Line line1 = new Line();
		Line line2 = new Line();
		LineComparison lineObject = new LineComparison();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("********** Line Comparison Program **********");
        System.out.println("Enter the end points of line one ");
        
//Enter end points of line 1
  
		System.out.println("Enter x1 : ");
		int xOneLineOne = sc.nextInt();
		System.out.println("Enter y1 : ");
		int yOneLineOne = sc.nextInt();
		
		System.out.println("Enter x2 : ");
		int xTwoLineOne = sc.nextInt();
		System.out.println("Enter y2 : ");
		int yTwoLineOne = sc.nextInt();
		line1.setStartCoordinates(xOneLineOne, yOneLineOne);
		line1.setEndCoordinates(xTwoLineOne, yTwoLineOne);
		
		System.out.println("Enter the end points of line two ");
        
//Enter end points of line 2
			  
		System.out.println("Enter x1 : ");
		int xOneLineTwo = sc.nextInt();
		System.out.println("Enter y1 : ");
		int yOneLineTwo = sc.nextInt();
			
		System.out.println("Enter x2 : ");
		int xTwoLineTwo = sc.nextInt();
		System.out.println("Enter y2 : ");
		int yTwoLineTwo = sc.nextInt();
		sc.close();
		
		line2.setStartCoordinates(xOneLineTwo, yOneLineTwo);
		line2.setEndCoordinates(xTwoLineTwo, yTwoLineTwo);
		
		lengthLine1 = lineObject.calculateLength(line1);
		lengthLine2 = lineObject.calculateLength(line2);
		
		lineObject.display(lengthLine1, lengthLine2);
		lineObject.checkEqualLengths(lengthLine1, lengthLine2);
		lineObject.compareLengths(lengthLine1, lengthLine2);
		
	}

	public double calculateLength(Line line) {
		
		int x1 = line.getStartCoordinates().getxCoordinate();
		int y1 = line.getStartCoordinates().getyCoordinate();
		int x2 = line.getEndCoordinates().getxCoordinate();
		int y2 = line.getEndCoordinates().getyCoordinate();
		
		return (Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
	}
	
	public void checkEqualLengths(double lengthA, double lengthB) {
		
		if(lengthA == lengthB)	
			System.out.println("Line1 & Line2 have equal lengths");
		else
			System.out.println("Line1 & Line2 do not have equal lengths");
	}
	
	public void compareLengths(double lengthA, double lengthB) {
		
		if((Double.compare(lengthA, lengthB)) == 0)
			System.out.println("Length of Line1 is equal to Length of Line2");
		else
			if((Double.compare(lengthA, lengthB)) < 0)
				System.out.println("Length of Line1 is less than Length of Line2");
		else
			if((Double.compare(lengthA, lengthB)) > 0)
				System.out.println("Length of Line1 is greater than Length of Line2");
	}
	
	public void display(double lengthA, double lengthB)
	{
		System.out.println("Length of Line1 : " +lengthA);
		System.out.println("Length of Line2 : " +lengthB);
	}
	
}

class Points extends LineComparison {
	
	private int xCoordinate;
	private int yCoordinate;
	
public int getxCoordinate() {
	
	return xCoordinate;
	}

public void setxCoordinate(int xCoordinate) {
	
	this.xCoordinate = xCoordinate;
	}

public int getyCoordinate() {
	
	return yCoordinate;
}
	
public void setyCoordinate(int yCoordinate) {
		
		this.yCoordinate = yCoordinate;
		
	}
}

class Line extends LineComparison{
	
	Points startCoordinates = new Points();
	Points endCoordinates = new Points();		
	
public Points getStartCoordinates() {
		
		return startCoordinates;
	}
	
public Points getEndCoordinates() {
		
		return endCoordinates;
	}
public void setStartCoordinates(int x1, int y1) {
	
	this.startCoordinates.setxCoordinate(x1);
	this.startCoordinates.setyCoordinate(y1);
}

public void setEndCoordinates(int x2, int y2) {
	
	this.endCoordinates.setxCoordinate(x2);
	this.endCoordinates.setyCoordinate(y2);
	}
}
