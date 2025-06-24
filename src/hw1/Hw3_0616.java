package hw1;

import java.util.Scanner;
import java.util.Random;

public class Hw3_0616 {
	public static void main(String[] args) {
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
//		(提示:Scanner,三角形成立條件,判斷式if else)
		// 思路 正三角形是全部相等,等腰三角形, 至少有兩條邊的長度相等。
		// 如果它們要能構成一個三角形，必須同時滿足以下三個條件：
//a+b>c
//a+c>b
//b+c>a
//		(進階功能:加入直角三角形的判斷)
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入第一個數字:");
		int a = sc.nextInt();
		System.out.println("請輸入第二個數字:");
		int b = sc.nextInt();
		System.out.println("請輸入第三個數字:");
		int c = sc.nextInt();
		if (!((a + b) > c && ((a + c) > b) && ((b + c) > a))) {
			System.out.println("不是三角形");
		} else {
			if (a == b && b == c) {
				System.out.println("正三角形");
			} else if (((b * b) + (c * c) == (a * a)) || ((a * a) + (c * c) == (b * b))
					|| ((b * b) + (a * a) == (c * c))) {
				System.out.println("直角三角形");
			} else if ((a == b && b != c) || (a == c && b != c) || (b == c && a != c)) {
				System.out.println("等腰三角形");
			} else {
				System.out.println("其它三角形");
			}
		}
		System.out.println("==============下一題==============");
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		System.out.println("請輸入你猜的數字:");
		while (true) {
			int e = (int) (Math.random() * 10);
			int d = sc.nextInt();
			if (d == e) {
				System.out.println("你答對拉");
				break;
			} else {
				System.out.println("你答錯拉");
			}
			System.out.println("再猜一次");
		}
		System.out.println("==============下一題==============");
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//	
		System.out.println("請輸入不想要看到的數字,範圍1~9");
		int f = sc.nextInt();

		System.out.println("你可以選的數字如下");
		int count = 0;
		int[] tempArray = new int[49];
		for (int number = 1; number <= 49; number++) {
			int g = number % 10;
			int h = number / 10;
			if (g != f && h != f) {
				System.out.print(number);
				System.out.print(" ");
				tempArray[count] = number;
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有幾個數字：" + count);
		System.out.println("進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複");
		// 思路拆解 需要先透過上面的公式知道陣列的長度，與把數字放到陣列裡，然後隨機陣列裡面的數6個，可以使用隨機交換法
		// 創造一個符合數量的陣列，遍歷陣列
		int[] lotteryNumbers = new int[count];
		for (int i = 0; i < lotteryNumbers.length; i++) {
			lotteryNumbers[i] = tempArray[i];
		}
		// 呼叫隨機的方法
		shuffleArray(lotteryNumbers);
		// 已經交換完成了，取6個數
		System.out.print("送你6個隨機數:");
		for (int i = 0; i <= 5; i++) {
			System.out.print(lotteryNumbers[i] + " ");
		}
		sc.close();	}
		// 創造隨機的方法
	public static void shuffleArray(int[] array) {
		Random rand = new Random();
		for (int i = array.length - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
	}
}
