package quiz16;

public class MainClass {
	public static void main(String[] args) {
		
		Shape rect = new Rect("네모",5);
		Shape circle = new Circle("동그리",5);
		
		System.out.println(rect.getName());
		System.out.println(rect.getArea());
		System.out.println(circle.getName());
		System.out.println(circle.getArea());

	
	}
}
