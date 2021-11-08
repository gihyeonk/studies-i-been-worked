
public class pyramid {

	public static void main(String[] args) {
		
		int i = 4;
		int j = 1;
		
		blank(i);
		
		star(j);
		
	
		

	}

	public static void star(int j) {
		while (j < 10) {
		System.out.println("*".repeat(j));
			j = j + 2;
		}
	}

	public static Object blank(int i) {
		while (i >= 0) {
			
			System.out.print(" \n".repeat(i));
			i = i - 1;
			
		}
		return i;
	}

}


