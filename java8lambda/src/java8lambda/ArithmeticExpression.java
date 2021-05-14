package java8lambda;

public class ArithmeticExpression {
	interface Arithmetic{
		int operation(int a, int b );
	}
	public static void main(String[] args) {
		Arithmetic addition = (int a, int b) -> (a+b);
		System.out.println("Addition = " +addition.operation(5,6));
		
		Arithmetic subtraction = (int a, int b) -> (a-b);
		System.out.println("Subtraction = " +subtraction.operation(5,6));
		
		Arithmetic multiply = (int a, int b) -> (a*b);
		System.out.println("Multiplication = " +multiply.operation(5,6));
		
		Arithmetic division = (int a, int b) -> (a/b);
		System.out.println("Division = " +division.operation(30,2));
	}

}
