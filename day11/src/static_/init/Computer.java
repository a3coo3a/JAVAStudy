package static_.init;

public class Computer {

	public static String company;
	public static String model;
	public int price;
	
	static {	// static 초기화자 : static 변수 초기화를 위한 static블럭
		System.out.println("정적초기화자 호출");
		company = "LG";
		model = "gram";		
	}	
	Computer(int price) {
		System.out.println("생성자 호출");
		// company = "LG";
		// 문법적 오류는 없지만, 생성자를 거치지 않기에 사용될 일이 없음
		
		// 일반변수만 생성자 초기화
		this.price = price;
	}

}
