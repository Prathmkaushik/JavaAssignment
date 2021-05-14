package java8lambda;

public class first {

	public static void main(String[] args) {
		MyLambda myLambdaFuction = () -> System.out.println("Hello World");
		MyAdd addFunction = (int a, int b) -> a+b; 

	}

interface MyLambda{
	void foo();
}
interface MyAdd{
	int add(int x, int y);
}
} 