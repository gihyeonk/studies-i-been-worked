
public class vending_machine_01 {

	public static void main(String[] args) {
	
		int money = Integer.parseInt(args[0]);
		int selection = Integer.parseInt(args[1]);
		int changes = 0;
		
		int coke = 850;
		int wuter = 600;
		int bepsi = 900;
		
		
		System.out.println("�ݾ��� �Է��ϼ���. : " + money + "��");
		System.out.println("�޴��� �����ϼ���! ");
		System.out.println("1. Coke(" + coke + "��)" + "2. Wuter (" + wuter + "��)" + "3. bepsi (" + bepsi + "��)" + " >>> " + selection + "��");
		
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
			System.out.println("�ݾ��� �����մϴ�.");
		}
		System.out.println("�ܵ� : " + changes + "��");

	}

}
