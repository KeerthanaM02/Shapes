package example;

import java.util.ArrayList;
import java.util.List;
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

class Result{
	public String shape,color;
	public double area;
	
	public void setResult(String shape,String color,double area){
		this.shape = shape;
		this.color = color;
		this.area = area;
	}
		
	public void print(){
		System.out.println("Shape: " + this.shape);
		System.out.println("Color: " + this.color);
		System.out.println("Area: " + this.area);
	}
}

public class Areas {
	
	public static void main(String[] args)
    {
		Shape shape;
		Scanner sc = new Scanner(System.in);
		double r,b,h;
		String clr;
		
		List<Result> result = new ArrayList<Result>();
		
		
		while(true){
			
		System.out.println("Enter the valid shape:");
		String str = sc.next();
		Result res = new Result();
			
		switch(str){
				
		case "Circle":{
			System.out.println("Enter the radius:");
			r = sc.nextDouble();
			System.out.println("Enter the color:");
			clr = sc.next();
			Circle ci = new Circle();
			shape = ci;
			shape.setColor(clr);
			ci.setRadius(r);
			res.setResult(str, clr, ci.area());
			result.add(res);
			/*System.out.println("Shape :" + str);
			System.out.println("Color of the Circle : " + shape.getColor());	
			System.out.println("Area of the Circle : " + ci.area());	*/
			break;
		}
		case "Rectangle":{
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
			res.setResult(str, clr, rect.area());
			result.add(res);
			break;
		}
		case "Triangle":{
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
			res.setResult(str, clr, tri.area());
			result.add(res);
			break;
		}
		case "Square":{
			System.out.println("Enter the side:");
			b = sc.nextDouble();
			System.out.println("Enter the Color:");
			clr = sc.next();
			Square sq = new Square();
			shape = sq;
			shape.setColor(clr);
			sq.setValues(b,b);
			res.setResult(str, clr, sq.area());
			result.add(res);
			break;
		}
		case "Exit":{
			for(int i=0;i<result.size();i++){
				result.get(i).print();
			}
			return;
		}
		
	     }
		
	 }
    }

}
