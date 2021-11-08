
public class creating_app_array_loop {

	public static void main(String[] args) {

	double supply_price = Double.parseDouble(args[0]);
	double tax_rate = 0.1;
	double tax = supply_price * tax_rate;
	double price = supply_price + tax; 
	double expense_rate = 0.3;
	double income_rate = 0.7;
	
	double expense = supply_price * expense_rate;
	double income = supply_price * income_rate;
	
	System.out.println("Supply Price : " + supply_price);
	System.out.println("Tax : " + tax);
	System.out.println("Price : " + price);
	System.out.println("Expense : " + expense);
	System.out.println("Income : " + income);
	
	double[] dividendRates = new double[3];
	dividendRates[0]= 0.7;
	dividendRates[1] = 0.2;
	dividendRates[2] = 0.1;
	
	
	int i = 0;
	while(i < dividendRates.length) {
		System.out.println("Income for boss : " + (income * dividendRates[i]) );
		i = i +1;
	}
	
	}

}
