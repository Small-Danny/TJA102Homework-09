package hw1;

public class hw02_0609 {
	public static void main(String[] args) {
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 2; i <= 1000; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("1~1000的偶數和:" + sum);
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum1 = 1;
		for (int i = 1; i <= 10; i++) {
			sum1 = sum * i;
		}
		System.out.println("1~10的連乘積:" + sum1);
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum2 = 1;
		int f = 1;
		while (f <= 10) {
			sum2 = sum * f;
			f++;
		}
		System.out.println("1~10的連乘積:" + sum2);
//	• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		for (int j = 1; j <= 10; j++) {
			int input = j * j;
			System.out.print(input);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("============我是分隔線==============");
//	阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//思路，1.遍歷1~49的數字 2.判斷是否有4 3.有4則不打印 4.無4則打印數字 5.統計打印出來的數
//思路   2.如何判斷是否有4 除10 餘4 ,大於40不要 3.計數的話，每次循環+1
		System.out.println("阿文可以選擇的數字有哪些?");
		int count = 0;
		for (int number = 1; number <= 39; number++) {
			if (number % 10 != 4) {
				System.out.print(number);
				System.out.print(" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("總共有幾個數字：" + count);
		System.out.println("============我是分隔線==============");
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
		// 思路 第一行是1~10；第二行是1~9，所以是遞減
		int m, n;
		for (m = 10; m >= 1; m--) {
			for (n = 1; n <= m; n++) {
				System.out.print(n);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("============我是分隔線==============");
//	請設計一隻Java程式,輸出結果為以下:使用迴圈
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		// 思路，本質上第一行是65*1 ='A'*1 第二行是 65+1 *2 (顯示狀) 第三行是 65+2*3(顯示)
		int k, l;
		int af = 65;
		for (k = 1; k <= 6; k++) {
			for (l = 1; l <= k; l++) {
				System.out.print((char) (af + k - 1));
			}
			System.out.println();
		}
	}
}
