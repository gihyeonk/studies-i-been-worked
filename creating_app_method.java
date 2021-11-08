
public class creating_app_method {
	public static double supply_price;
	public static double tax_rate;
	public static double expense_rate;
	public static double income_rate;
	public static double income_rate_boss;
	private static double income_rate_vice;
	private static double income_rate_work;
	public static void main(String[] args) {

	supply_price = 10000.0;
	tax_rate = 0.1;
	expense_rate = 0.3;
	income_rate = 0.7;
	income_rate_boss = 0.7;
	income_rate_vice = 0.2;
	income_rate_work = 0.1;
	
	print();
	
	}

	private static void print() {
		System.out.println("Supply Price : " + supply_price);
		System.out.println("Tax : " + getTAX());
		System.out.println("Price : " + getPrice());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Income for boss : " + getincome_boss());
		System.out.println("Income for vice president : " + getIncome_vice());
		System.out.println("Income for worker : " + getIncome_work());
	}

	private static double getIncome_work() {
		double income_work = getIncome() * income_rate_work;
		return income_work;
	}

	private static double getIncome_vice() {
		double income_vice = getIncome() * income_rate_vice;
		return income_vice;
	}

	private static double getincome_boss() {
		double income_boss = getIncome() * income_rate_boss;
		return income_boss;
	}

	private static double getIncome() {
		double income = supply_price * income_rate;
		return income;
	}

	private static double getExpense() {
		double expense = supply_price * expense_rate;
		return expense;
	}

	private static double getPrice() {
		double price = supply_price + getTAX();
		return price;
	}

	private static double getTAX() {
		return supply_price * tax_rate;
	}

}
