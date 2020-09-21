package static_.singleton;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.util.Calendar;

public class MainClass {
	public static void main(String[] args)  {
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.getName());
		s2.setName("홍길자");
		System.out.println(s2.getName());
		
		System.out.println(s1 == s2);
		System.out.println(s1.getName());
		
		// 실예시
		
//		Calendar cal = Calendar.getInstance();
//		Connection con = DriverManager.getConnection("xxx");
		
		
	
		
		
	}
}
