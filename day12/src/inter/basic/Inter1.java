package inter.basic;

public interface Inter1 {
	// 상수, 추상메서드 정의
	// 일반변수를 선언해도 자동으로 상수가 됨.(public도 자동으로 붙음)
	// public static final double PI = 3.14; 형태가 된거임.
	// - 상수이기에 초기화 필
	double PI=3.14;
	// 일반 메서드를 선언해도 자동으로 추상 메서드가 됨.
	public void method1(); 
	
	// java 1.8이후
	// - static 메서드 선언 가능
//	public static void method2() {
//		
//	}
	
}
