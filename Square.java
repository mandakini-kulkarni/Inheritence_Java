package com.in28minutes.inheritancess.examples;

public class Square extends Rectangle{
	int side;
	 public Square(int s)
	 {
		 super(s,s);
		 side=s;
		 
	 }
 public int area()
 {
	 return side*side;
 }
 public int perimeter()
 {
	 return 4*side;
 }
}
