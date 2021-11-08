
public class multiplication_table {

	public static void main(String[] args) {

		double start_line = Double.parseDouble(args[0]);
		
		double[] gugudanRates = new double[9];
		gugudanRates[0] = 1;
		gugudanRates[1] = 2;
		gugudanRates[2] = 3;
		gugudanRates[3] = 4;
		gugudanRates[4] = 5;
		gugudanRates[5] = 6;
		gugudanRates[6] = 7;
		gugudanRates[7] = 8;
		gugudanRates[8] = 9;
		
		System.out.println("구구단을 외우자");
		
		int i = 0;
		while (i < gugudanRates.length) {
			System.out.println( (start_line * gugudanRates[i]) );
			i = i + 1;
		}
		

		
	}

}
