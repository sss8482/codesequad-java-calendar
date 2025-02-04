package calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal> ";

	public void runPrompt() { // 숫자를 입력받아 해당하는 달의 최대일수를 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;
		int year = 2017;

		while (true) {

			System.out.println("년도를 입력하세요");
			System.out.println(PROMPT);
			year = scanner.nextInt();

			System.out.println("달을 입력하세요");
			System.out.println(PROMPT);
			month = scanner.nextInt();

			if (month == -1) {
				break;
			}

			if (month > 12) {
				continue;
			}
			cal.printCalendar(year, month);

		}

		System.out.println("종료");
		scanner.close();

		// cal.printSampleCalendar();

	}

	public static void main(String[] args) {

		Prompt p = new Prompt();
		p.runPrompt();

	}
}