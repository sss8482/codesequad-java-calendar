package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {

		int a, b;

		Scanner scanner = new Scanner(System.in);

		String s1, s2;
		System.out.println("두수를 입력해주세요");
		s1 = scanner.next();
		s2 = scanner.next();

		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(s1 + ", " + s2);

		System.out.printf("%d 와 %d 합은 %d 입니다", a, b, a + b);
		
		scanner.close();
		
		

	}

}
