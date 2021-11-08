
public class creating_app_if {

	public static void main(String[] args) {

	double supply_price = Double.parseDouble(args[0]);
	double tax_rate = 0.1;
	double tax = supply_price * tax_rate;
	double price = supply_price + tax; 
	double expense_rate = 0.3;
	double income_rate = 0.7;
	double income = supply_price * income_rate;
	
	double income_boss;
	double income_vice;
	double income_work;
	
	if (income > 10000.0) {
		income_boss = income * 0.7;
		income_vice = income * 0.2;
		income_work = income * 0.1;
	} else {
		income_boss = income * 1.0;
		income_vice = income * 0;
		income_work = income * 0;
	}
	
	double expense = supply_price * expense_rate;
	
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
