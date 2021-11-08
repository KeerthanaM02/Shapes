package example;

import java.util.Scanner;

class Shape{
	
	public double h;  
	public double w; 
	public double a;
  
	public void setValues(double height, double width){
	    this.h = height;
	    this.w = width;
	}
	 
	public void setValues(double side){
	   this.a = side;
	}
  
    public double getHeight(){
       return h;
    }
	     
    public double getWidth(){
       return w;
    }    
	
    public double getSide(){
	   return a;
    }
    
}

class Rectangle extends Shape{
	
	public double area(){
		return getWidth()*getHeight();
	}
	
}

class Triangle extends Shape{ 
	
    public double area() 
    {
        return (getHeight() * getWidth())/2;
    }
    
}    

class Circle extends Shape{
	
	public double area(){
		double pi = 3.14;
		return (pi*getSide());
	}

}

class Square extends Shape{
	
	public double area(){
		return (getSide()*getSide());
	}
	
}


public class ShapeArea{
	
	public static void main(String[] args)
    {
    
		Shape shape;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the valid shape:");
		String str = sc.next();
		double a,b,h;
		
		if(str.equals("Rectangle")){
			System.out.println("Enter the breath:");
			b = sc.nextFloat();
			System.out.println("Enter the height:");
			h = sc.nextFloat();
			Rectangle rect = new Rectangle();
			shape = rect;
			shape.setValues(h,b);
			System.out.println("Area of the Rectangle : " + rect.area());			
		}else if(str.equals("Triangle")){
			System.out.println("Enter the breath:");
			b = sc.nextFloat();
			System.out.println("Enter the height:");
			h = sc.nextFloat();
			Triangle tri = new Triangle();
			shape = tri;
			shape.setValues(h,b);
			System.out.println("Area of the Triangle : " + tri.area());			
		}else if(str.equals("Circle")){
			System.out.println("Enter the radius:");
			a = sc.nextFloat();
			Circle ci = new Circle();
			shape = ci;
			shape.setValues(a);
			System.out.println("Area of the Triangle : " + ci.area());			
		}else if(str.equals("Square")){
			System.out.println("Enter the side:");
			a = sc.nextFloat();
			Square sq = new Square();
			shape = sq;
			shape.setValues(a);
			System.out.println("Area of the Triangle : " + sq.area());			
		}else{
			System.out.println("Invalid Parameter");
		}
		
    }
	
}


