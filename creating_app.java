
public class creating_app {

	public static void main(String[] args) {

	double supply_price = Double.parseDouble(args[0]);
	double tax_rate = 0.1;
	double tax = supply_price * tax_rate;
	double price = supply_price + tax; 
	double expense_rate = 0.3;
	double income_rate = 0.7;
	double income_rate_boss = 0.7;
	double income_rate_vice = 0.2;
	double income_rate_work = 0.1;
	double expense = supply_price * expense_rate;
	double income = supply_price * income_rate;
	double income_boss = income * income_rate_boss;
	double income_vice = income * income_rate_vice;
	double income_work = income * income_rate_work;
	
	System.out.println("Supply Price : " + supply_price);
	System.out.println("Tax : " + tax);
	System.out.println("Price : " + price);
	System.out.println("Expense : " + expense);
	System.out.println("Income : " + income);
	System.out.println("Income for boss : " + income_boss);
	System.out.println("Income for vice president : " + income_vice);
	System.out.println("Income for worker : " + income_work);
	
	}

}
