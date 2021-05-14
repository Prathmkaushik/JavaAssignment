package Shape;

public abstract class shape {
	abstract void draw();
}
class Line extends shape{
	void draw() {
		System.out.println("Drawing line");
	}
}
class Rectangle extends shape{
	void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Cube extends shape{
	void draw() {
		System.out.println("Drawing cube");
	}
}
class Abstraction{
	public static void main(String[] args) {
		shape L = new Line();
		L.draw();
		shape R = new Rectangle();
		R.draw();
		shape C = new Cube();
		C.draw();
	}
}