class Accounting{
	public double supply_price;
	public double tax_rate;
	public double expense_rate;
	public double income_rate;
	public double income_rate_boss;
	public double income_rate_vice;
	public double income_rate_work;
	public void print() {
		System.out.println("Supply Price : " + supply_price);
		System.out.println("Tax : " + getTAX());
		System.out.println("Price : " + getPrice());
		System.out.println("Expense : " + getExpense());
		System.out.println("Income : " + getIncome());
		System.out.println("Income for boss : " + getincome_boss());
		System.out.println("Income for vice president : " + getIncome_vice());
		System.out.println("Income for worker : " + getIncome_work());
	}
	
	public  double getIncome_work() {
		double income_work = getIncome() * income_rate_work;
		return income_work;
	}

	public double getIncome_vice() {
		double income_vice = getIncome() * income_rate_vice;
		return income_vice;
	}

	public double getincome_boss() {
		double income_boss = getIncome() * income_rate_boss;
		return income_boss;
	}

	public double getIncome() {
		double income = supply_price * income_rate;
		return income;
	}

	public double getExpense() {
		double expense = supply_price * expense_rate;
		return expense;
	}

	public double getPrice() {
		double price = supply_price + getTAX();
		return price;
	}

	public double getTAX() {
		return supply_price * tax_rate;
	}

}
public class creating_app_class {
	
	public static void main(String[] args) {
		// instance
		Accounting a1 = new Accounting();
		a1.supply_price = 10000.0;
		a1.tax_rate = 0.2;
		a1.expense_rate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.supply_price = 50000.0;
		a2.tax_rate = 0.4;
		a2.expense_rate = 0.5;
		a2.print();
	}

	
}
