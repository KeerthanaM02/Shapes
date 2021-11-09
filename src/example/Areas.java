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
	public double area(){
		return 0;
	}
}

class Circle extends Shape{
	
	public double radius;
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	  
	public double getRadius(){
	   return radius;
	}
	
	public double area(){
		double pi = 3.14;
		return (pi*radius*radius);
	}
	
}

class NonCircular extends Shape{

	public double h;  
	public double w; 

	public void setValues(double height, double width){
	    this.h = height;
	    this.w = width;
	}

	public double getHeight(){
	    return h;
	}

	public double getWidth(){
	    return w;
	}  

}

class Rectangle extends NonCircular{
	
	public double area(){
		return (getHeight()*getWidth());
	}
}

class Triangle extends NonCircular{ 
	
    public double area() 
    {
        return (getHeight()*getWidth())/2;
    }
    
}  

class Square extends NonCircular{
	
	public double area(){
		return (getHeight()*getWidth());
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
			r = sc.nextDouble();
			System.out.println("Enter the color:");
			clr = sc.next();
			Circle ci = new Circle();
			shape = ci;
			shape.setColor(clr);
			ci.setRadius(r);
			System.out.println("Color of the Triangle : " + shape.getColor());	
			System.out.println("Area of the Triangle : " + ci.area());			
		}else if(str.equals("Rectangle")){
			System.out.println("Enter the breath:");
			b = sc.nextDouble();
			System.out.println("Enter the height:");
			h = sc.nextDouble();
			System.out.println("Enter the Color:");
			clr = sc.next();
			Rectangle rect = new Rectangle();
			shape = rect;
			shape.setColor(clr);
			rect.setValues(h,b);
			System.out.println("Color of the Rectangle : " + shape.getColor());	
			System.out.println("Area of the Rectangle : " + rect.area());			
		}else if(str.equals("Triangle")){
			System.out.println("Enter the breath:");
			b = sc.nextDouble();
			System.out.println("Enter the height:");
			h = sc.nextDouble();
			System.out.println("Enter the color:");
			clr = sc.next();
			Triangle tri = new Triangle();
			shape = tri;
			shape.setColor(clr);
			tri.setValues(h,b);
			System.out.println("Color of the Triangle : " + shape.getColor());
			System.out.println("Area of the Triangle : " + tri.area());			
		}else if(str.equals("Square")){
			System.out.println("Enter the side:");
			b = sc.nextDouble();
			System.out.println("Enter the Color:");
			clr = sc.next();
			Square sq = new Square();
			shape = sq;
			shape.setColor(clr);
			sq.setValues(b,b);
			System.out.println("Color of the Square : " + shape.getColor());
			System.out.println("Area of the Square : " + sq.area());			
		}else{
			System.out.println("Invalid Parameter");
		}
    }

}
