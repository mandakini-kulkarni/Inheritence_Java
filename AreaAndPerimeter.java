package com.in28minutes.inheritancess.examples;

public class AreaAndPerimeter {

	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle(5,2);
		System.out.println( "Area of rectangle is" +" "+  r.area());
		System.out.println("Perimeter of rectangle is" + " "+ r.perimeter());
		
		Square sq=new Square(3);
		System.out.println("Area of square is"  + " "+ sq.area());
		System.out.println("Perimeter of square is"  + " "+ sq.perimeter());                                                                                                      
		

	}

}
