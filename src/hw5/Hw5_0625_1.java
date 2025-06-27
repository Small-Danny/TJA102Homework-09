package hw5;

import java.util.Scanner;

public class Hw5_0625_1 {
	// 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,
	public void starSquare(int width, int height) {
		for (int m = 1; m <= height; m++) {
			for (int n = 1; n <= width; n++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	//創造一個儲存這10個數的陣列，隨機0~100，確定沒問題後計算平均值，打印亂數與平均;
	public void randAvg() {
		int[] tempArray = new int[10];
		for(int i=0;i<10;i++) {
			tempArray[i]= (int) (Math.random() * 101);
		}
		System.out.print("10個亂數數:");
		int sum=0;
		for (int i = 0; i <= 9; i++) {
			System.out.print(tempArray[i] + " ");
			sum +=tempArray[i];
		}
		System.out.println("平均值為"+(sum/10));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入高度:");
		int height = sc.nextInt();
		System.out.println("請輸入寬度:");
		int width = sc.nextInt();
		Hw5_0625_1 obj = new Hw5_0625_1();
		obj.starSquare(width, height);
		obj.randAvg();
		sc.close();
	}
}
