package inter.basic2;

public class PetShop {
	// 1. carePet() 메서드 선언
	// 기능 - 모든 IPet 전달 타입을 받아서, 어떤 펫 타입인지 확인하는 메서드
	public void carePet(IPet ipet) {
		if(ipet instanceof Cat) {
			System.out.println("Cat 타입");
		}else if(ipet instanceof Dog) {
			System.out.println("Dog 타입");
		}else if (ipet instanceof GoldFish) {
			System.out.println("GoldFish 타입");
		}else {
			System.out.println("IPet을 interface하지 않았습니다.");
		}
	}
	// 2. IPet 배열을 받아서 Pet배열 안에 있는 기능을 반복문으로 수행
	public void for_IPetMethod(IPet[] ipet) {
		for (IPet ip : ipet) {
			ip.play();
		}
	}
}
