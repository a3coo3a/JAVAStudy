package quiz15;

public class Tank extends Unit {
	
	public Tank() {
		super(0, 0, 100);
	}

	
	void changeMode() {
		System.out.println("공격모드로 변경");
	}

	@Override
	public void location() {
		System.out.println("Tank의 현재 위치는");
		System.out.println("x : " + getX() + ", y:" + getY());
		System.out.println("----------------------");
	}

	@Override
	public void move(int x, int y) {
		int moveX = x-getX();
		int moveY = y-getY();
		double distance = Math.sqrt(moveX*moveX + moveY*moveY);	// 이동거리
		setX(x);
		setY(y);
		System.out.println("Tank 이동 거리 : " + (int) distance);
		System.out.println("----------------------");
	}
}
