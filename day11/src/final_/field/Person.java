package final_.field;

public class Person {
	
	// final 변수  
	// - 값이 대입되면 변경할 수 없기 때문에
	// - 직접 초기화 하거나, 생성자를 통해서 반드시 초기화 해야합니다.
	
	
	public final String nation="대한민국";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}
	
}
