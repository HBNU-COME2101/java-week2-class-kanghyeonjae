package chapter1;

import java.util.Scanner;


public class chapter1_5 {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >> ");
		int age = scanner.nextInt();
		
		if (age<=0) {
			System.out.print("나이는 양수로만 입력하세요.");
		}
		int redcho = age/10;
		int bluecho = (age%10)/5;
		int yellowcho = (age%10)%5;
		int total = redcho+bluecho+yellowcho;
		
		System.out.printf("빨간 초 %d개, 파란 초 %d개,노란초 %d개, 총 %d개가 필요합니다."
				,redcho,bluecho,yellowcho,total);
		
		
		
		scanner.close();
		
	}
}
