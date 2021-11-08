
public class creating_app_array {

	public static void main(String[] args) {

	double supply_price = Double.parseDouble(args[0]);
	double tax_rate = 0.1;
	double tax = supply_price * tax_rate;
	double price = supply_price + tax; 
	double expense_rate = 0.3;
	double income_rate = 0.7;

	double[] dividendRates = new double[3];
	dividendRates[0]= 0.7;
	dividendRates[1] = 0.2;
	dividendRates[2] = 0.1;
	
	double expense = supply_price * expense_rate;
	double income = supply_price * income_rate;
	
	double income_boss = income * dividendRates[0];
	double income_vice = income * dividendRates[1];
	double income_work = income * dividendRates[2];
	
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
