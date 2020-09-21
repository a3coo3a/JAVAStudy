package quiz17;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// 인터페이스 형으로 선언하고, 무한반복문 안에서
		// 추가, 재생, 종료 메뉴를 입력 받아서 클래스의 각 기능을 실행 해 보세요
		SongList list = new BugsMusic();  //new MelonMusic();
		Scanner sc = new Scanner(System.in);
		end : while(true) {
		
			System.out.println(" <<  메 뉴 선 택   >>");
			System.out.println("1. 추가\t2. 재생\t3. 종료");
			System.out.print(">> ");
			String select = sc.next();
			
			switch (select) {
			case "1":
			case "1번":	
			case "추가":
				sc.nextLine();
				System.out.print("추가할 노래 제목을 입력 하세요 >> ");
				String songTitle = sc.nextLine();
				list.insertList(songTitle);
				list.playLength();
				break;
			case "2":
			case "2번":	
			case "재생":
				list.playList();
				break;
			case "3":
			case "3번":	
			case "종료":
				System.out.println("종료하겠습니다.");
				break end;
			default:
				System.out.println("잘못 입력하였습니다 다시 입력해주세요");
				break;
			}
			
			
			
			
		}
	}
}
