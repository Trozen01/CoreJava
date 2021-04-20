import java.util.Scanner;


public class Calculator {
	
	 
	public static double result,first,second;
	

	public static void calculation(){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number:-");
		first = sc.nextDouble();
		
		//System.out.println("Enter operator:-");
		//char operator = sc.next().charAt(0);
		
		System.out.println("Enter second number:- ");
		second = sc.nextDouble();
		sc.close();
		
		result =  first + second;
		System.out.println("Result is:-" +result);
		
	}
	
	
	public static void main(String[] args) {
	
     Calculator cal = new Calculator();
     cal.calculation();
		
	}

}
