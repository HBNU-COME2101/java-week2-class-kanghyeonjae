package chapter1;

import java.util.Scanner;


public class chapter1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("생일을 입력 하세요 >>" );
		int birthday = scanner.nextInt();
		
		int year = birthday/10000;
		int month = (birthday%10000)/100;
		int day = (birthday%10000)%100;
		
		System.out.printf("%d년 %d월 %d일",year,month,day);
		
		scanner.close();
		
		

	}

}
