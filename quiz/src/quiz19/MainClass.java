package quiz19;

public class MainClass {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		try {
			System.out.println("결과값 : " + cal.input());
		} catch (Exception e) {
			e.printStackTrace();
			/*
			 * throws로 넘어오면서 Exception으로 형변환이 이루어짐.
			 * java.lang.Exception
			 * at quiz19.Calculator.input(Calculator.java:29)
			 * at quiz19.MainClass.main(MainClass.java:7)
			 */
		}

	}
}
