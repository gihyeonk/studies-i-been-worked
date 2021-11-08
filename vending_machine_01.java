
public class vending_machine_01 {

	public static void main(String[] args) {
	
		int money = Integer.parseInt(args[0]);
		int selection = Integer.parseInt(args[1]);
		int changes = 0;
		
		int coke = 850;
		int wuter = 600;
		int bepsi = 900;
		
		
		System.out.println("금액을 입력하세요. : " + money + "원");
		System.out.println("메뉴를 선택하세요! ");
		System.out.println("1. Coke(" + coke + "원)" + "2. Wuter (" + wuter + "원)" + "3. bepsi (" + bepsi + "원)" + " >>> " + selection + "번");
		
		if (money > 600) {
		if (selection == 1) {
			changes = money - coke;
		} else {
			if (selection == 2) {
				changes = money - wuter;
				} else {
					if (selection == 3) {
						changes = money - bepsi;
					} else {
						System.out.println("Please select the right product.");
					}
				}
		}
		} else {
			System.out.println("금액이 부족합니다.");
		}
		System.out.println("잔돈 : " + changes + "원");

	}

}
