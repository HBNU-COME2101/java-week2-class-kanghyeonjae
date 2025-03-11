package chapter1;

import java.util.Scanner;
public class chapter1_6 {

	public static void main(String []args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("(x1,y1),(x2,y2)의 좌표 입력>>");
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		int minx = (x1<x2)? x1:x2;
		int maxx = (x1>x2)? x1:x2;
		int miny = (y1<y2)? y1:y2;
		int maxy = (y1>y2)?	y1:y2;
		
		if(minx>=10 && miny>=10 && maxx<=200 && maxy<=300) {
			System.out.printf("(%d,%d),(%d,%d)사각형은 (%d,%d)(%d,%d)사각형에 포함된다."
					,minx,miny,maxx,maxy,10,10,200,300);
			}
		else
			{
				System.out.printf("(%d,%d),(%d,%d)사각형은 (%d,%d)(%d,%d)사각형에 포함되지 않는다."
						,minx,miny,maxx,maxy,10,10,200,300);
			}
		
		
		scanner.close();
	}
	
	
}


