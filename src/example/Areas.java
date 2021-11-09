package example;

import java.util.Scanner;

class Shape{
	String clr;
	
	public void setColor(String color){
		this.clr = color;
	}
	  
	public String getColor(){
	   return clr;
	}
	public double area(double l,double b){
		return 0;
	}
	public double area(double r){
		return 0;
	}
}

class Circle extends Shape{
	
	public double area(double r){
		double pi = 3.14;
		return (pi*r*r);
	}
	
}

class Rectangle extends Shape{
	
	public double area(double w,double h){
		return (w*h);
	}
}

class Triangle extends Shape{ 
	
    public double area(double w,double h) 
    {
        return (w*h)/2;
    }
    
}  

class Square extends Shape{
	
	public double area(double w,double h){
		return (w*h);
	}
	
}

public class Areas {
	
	public static void main(String[] args)
    {
		Shape shape;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valid shape:");
		String str = sc.next();
		double r,b,h;
		String clr;
		
		if(str.equals("Circle")){
			System.out.println("Enter the radius:");
			r = sc.nextFloat();
			System.out.println("Enter the color:");
			clr = sc.next();
			Circle ci = new Circle();
			shape = ci;
			shape.setColor(clr);
			System.out.println("Color of the Triangle : " + shape.getColor());	
			System.out.println("Area of the Triangle : " + ci.area(r,r));			
		}else if(str.equals("Rectangle")){
			System.out.println("Enter the breath:");
			b = sc.nextFloat();
			System.out.println("Enter the height:");
			h = sc.nextFloat();
			System.out.println("Enter the Color:");
			clr = sc.next();
			Rectangle rect = new Rectangle();
			shape = rect;
			shape.setColor(clr);
			System.out.println("Color of the Rectangle : " + shape.getColor());	
			System.out.println("Area of the Rectangle : " + rect.area(b,h));			
		}else if(str.equals("Triangle")){
			System.out.println("Enter the breath:");
			b = sc.nextFloat();
			System.out.println("Enter the height:");
			h = sc.nextFloat();
			System.out.println("Enter the color:");
			clr = sc.next();
			Triangle tri = new Triangle();
			shape = tri;
			shape.setColor(clr);
			System.out.println("Color of the Triangle : " + shape.getColor());
			System.out.println("Area of the Triangle : " + tri.area(b,h));			
		}else if(str.equals("Square")){
			System.out.println("Enter the side:");
			b = sc.nextFloat();
			System.out.println("Enter the Color:");
			clr = sc.next();
			Square sq = new Square();
			shape = sq;
			shape.setColor(clr);
			System.out.println("Color of the Square : " + shape.getColor());
			System.out.println("Area of the Square : " + sq.area(b,b));			
		}else{
			System.out.println("Invalid Parameter");
		}
    }

}
