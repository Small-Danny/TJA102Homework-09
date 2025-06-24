package hw1;

public class Hw4_0620_1 {
	public static void main(String[] args) {
////		有個一維陣列如下:
////		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
////		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
////		(提示:陣列,length屬性)
		int sum = 0;
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		int avg = sum / x.length;
		System.out.println("此陣列平均值為：" + avg);
		for (int j = 0; j < x.length; j++) {
			if (avg < x[j]) {
				System.out.println("大於平均值的元素為" + x[j]);
			}
		}
		System.out.println("=================我是分隔線=================");
////	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
////	例如String s = “Hello World”,執行結果即為dlroW olleH
////	(提示:String方法,陣列)
////	
		String s = "Hello World";
		// 將字串轉成字元，將字元倒著打印
		System.out.print("倒著打印的結果是:");
		int s1 = s.length();
		for (int i = s1 - 1; i >= 0; i--) {
			char a = s.charAt(i);
			System.out.print(a);
		}
		System.out.println(" ");
		System.out.println("=================我是分隔線=================");
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
		String planets[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//先取出每個字串，將字串全拼在一起轉成字元，比較符合aeiou
		String u = "";
		for (int i = 0; i < planets.length; i++) {
			u += planets[i];
		}
		int count = 0;
		int u1 = u.length();
		for (int i = 0; i < u1; i++) {
			if (u.charAt(i) == 'a' || u.charAt(i) == 'e' || u.charAt(i) == 'i' || u.charAt(i) == 'o'
					|| u.charAt(i) == 'u')
				count++;
		}
		System.out.print("共有" + count + "個母音");
	}
}