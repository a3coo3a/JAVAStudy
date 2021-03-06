package quiz15;

public class DropShip extends Unit {

	public Unit[] unit = new Unit[8];	// 수송선의 공간
	public int index = 0;	// unit배열의 인덱스
	
	public DropShip() {
		super(0, 0, 200);
	}
	
	@Override
	public void location() {
		System.out.println("DropShip의 현재 위치는");
		System.out.println("x : " + getX() + ", y:" + getY());
		System.out.println("----------------------");
	}

	/*
	 * move()는 마린과 동일함
	 * 단, 수송선이 이동하면, 수송선 배열에 있느 모든 유닛의 위치가 수송선 위치로 바뀝니다.
	 */
	
	@Override
	public void move(int x, int y) {
		int moveX = x-getX();
		int moveY = y-getY();
		double distance = Math.sqrt(moveX*moveX + moveY*moveY);	// 이동거리
		setX(x);
		setY(y);
		System.out.println("DropShip 이동 거리 : " + (int) distance);
		chMove(x,y);
		System.out.println("----------------------");
	}
	
	private void chMove(int x, int y) {
		for (int i = 0; i < unit.length; i++) {
			if(unit[i] == null) continue;
			unit[i].setX(x);
			unit[i].setY(y);
		}
		
	}
	/*
	 * ride()
	 * - 모든 유닛을 받을 수 있도록 선언
	 * 1. 배열의 크기는 8이고, 수송선 배열에는 탱크와 마린이 탈 수 있다.
	 * 		탱크는 배열을 4칸씩 사용, 마린은 배열을 1칸씩 사용
	 * 
	 * 2. 배열에 유닛이 탈 수 있으면 유닛을 배열에 저장합니다.
	 * 		배열에 전부 타거나, 탈 수 있는 공간이 없으면 "공간이 부족합니다" 를 출력
	 * 
	 * 3. 수송선에 탄 유닛을 가로로 출력하면 됩니다.
	 */
	public void ride(Unit unit) {
		if(unit instanceof Marine) {
			if (index >= 0 && index <= this.unit.length-1) {
				this.unit[index] = unit;
				index++;
			}else {
				System.out.println("공간이 부족합니다.");
			}
		}else if(unit instanceof Tank) {
			if (index >= 0 && index <= this.unit.length-4) {
				this.unit[index] = unit;
				index += 4;
			}else {
				System.out.println("공간이 부족합니다.");
			}
		}else {
			System.out.println("잘못된 접근입니다.");
		}
		
		//출력 -----------------------------------------
		System.out.print("수송선에 탄 Unit은 [");
		for (int i = 0; i < index; i++) {
			if(this.unit[i] == null) continue;
			System.out.print(this.unit[i] instanceof Marine? "Marine" : "Tank");
			System.out.print(this.unit[i] instanceof Marine?(i==index-1?"":", "):(i==index-4?"":", "));
		}
		System.out.println("]");
	}
}
