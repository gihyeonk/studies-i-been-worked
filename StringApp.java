
public class StringApp {

	public static void main(String[] args) {
		
		// Character vs String
		System.out.println("Hello World"); // String 문자열 Character 들이 모여있는 것들
		System.out.println('H'); // Character 문자 작은 따옴표는 의미가 달라지니 쓰지 마십쇼
		System.out.println("H"); // 큰 따옴표는 문자열 작은 따옴표는 문자
		
		System.out.println("Hello "
				+ "World");
		
		// new line
		System.out.println("Hello \nWorld");
		
		// escape
		System.out.println("Hello \"World\""); // Hello "World" 큰 따옴표는 문자의 시작과 끝을 알리는 특수한 기호, \ 뒤에 있는 문자의 역할을 해방시키는 것
	}

}
