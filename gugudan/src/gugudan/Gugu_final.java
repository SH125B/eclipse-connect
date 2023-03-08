package gugudan;

import java.util.*;

public class Gugu_final {
	public static void main(String[] args) {
		
		System.out.println("구구단을 출력합니다. 숫자나 숫자,숫자를 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);

		if (splitedValue.length == 1) {
			
			// 2*1~ 8*8
			System.out.println(first+"단까지 출력");
			for (int i=2; i<=first; i++) {
				System.out.println(i +"단");
				for(int j=1; j<=first; j++) {
					System.out.print(i+ "*" +j+ "= ");
					System.out.println(i*j);
				}
				System.out.println("-------------");
			}
			
		}
		else {
			int second = Integer.parseInt(splitedValue[1]);

			// 87
			System.out.println(first+ "*" + second + "단 출력");
			for (int i=2; i<=first; i++) {
				System.out.println(i +"단");
				for(int j=1; j<=second; j++) {
					System.out.print(i+ "*" +j+ "= ");
					System.out.println(i*j);
				}
				System.out.println("-------------");
			}
			
		}	

	
		
	}
	
}
