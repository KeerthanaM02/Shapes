package example;

import java.util.Scanner;

public class Shapes {
	
	
	float area(float b,float h){
		return b*h;
	}
	
	float area(float a){
		return a*a;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the valid shape:");
		
		Shapes shape = new Shapes();
		String str = sc.next();
		float a,b, h;
		double pi = 3.14;
		float area = 0;
		
		if(str.equals("Rectangle")){
			System.out.println("Enter the breath :");
			b = sc.nextFloat();
			System.out.println("Enter the height :");
			h = sc.nextFloat();
			area = shape.area(b, h);
			System.out.println("Area of the rectangle :" + area);
			
		}else if(str.equals("Triangle")){
			System.out.println("Enter the breath :");
			b = sc.nextFloat();
			System.out.println("Enter the height :");
			h = sc.nextFloat();
			area = shape.area(b, h);
			area = (float) (0.5*area);
			System.out.println("Area of the triangle :" +area);
		}else if(str.equals("Circle")){
			System.out.println("Enter the radius :");
			a = sc.nextFloat();
			area = shape.area(a);
			area = (float) (pi*area);
			System.out.println("Area of the circle :" +area);
		}else if(str.equals("Square")){
			System.out.println("Enter the sides :");
			a = sc.nextFloat();
			area = shape.area(a);
			System.out.println("Area of the square :" +area);
		}else{
			System.out.println("Invalid Argument");
		}

	}

}
