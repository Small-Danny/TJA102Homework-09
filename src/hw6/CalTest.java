package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Calculator xy =new Calculator();
		
		System.out.println("請輸入x值");
		int x=sc.nextInt();
		System.out.println("請輸入y值");
		int y=sc.nextInt();
		
		try {
			double result =xy.powerXY(x,y);
			System.out.println("x的y次方是:"+(int)result);
		}catch(CalException e){
			System.out.println("發生錯誤"+e.getMessage());
			
		}
		finally{
			System.out.println("運算結束");
			sc.close();
		}
	}
}
