package chapter1;

import java.util.Scanner;

public class chapter1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("여행지 >> ");
		String destination = scanner.nextLine(); //여행지 입력
		System.out.print("인원수 >> ");
		int np = scanner.nextInt(); // 인원수 입력
		System.out.print("숙박일 >> ");
		int hd = scanner.nextInt(); // 숙박일 입력
		System.out.print("1인당 항공료 >> ");
		int airfare = scanner.nextInt(); // 항공료 입력
		System.out.print("1인당 숙박비 >> ");
		int nightfare = scanner.nextInt(); //숙박료 입력
		
		int numrooms = np /2; //필요한 방 개수 계산
		if(np % 2 != 0) {
			numrooms+=1;
		}
		
		int totalairfare = airfare*np;
		int totalroomcost = nightfare*numrooms*hd;
		int total = totalairfare + totalroomcost;
		System.out.printf("%d명의 %s %d박 %d일 여행에는 방이%d개 필요하며 경비는 %d"
				+ "원입니다.\n",np,destination,hd,hd+1,numrooms,total);
		scanner.close();
	}

}



