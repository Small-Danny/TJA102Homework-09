package hw1;

public class Hw1_0605 {
	public static void main(String[] args) {
// 請設計一隻Java程式,計算12,6這兩個數值的和與積
//		int a = 12, b = 6;
//		System.out.println("12+6=" + (a + b));
//		System.out.println("12*6=" + a * b);
		System.out.println("12+6=" + (12 + 6));
		System.out.println("12*6=" + 12 * 6);
//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200;
		int dozen = egg / 12;
		int piece = egg % 12;
		System.out.println("200顆蛋是" + dozen + "打" + piece + "顆");
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int seconds = 256559;
		int days = seconds / 60 / 60 / 24;
		int remainseconds = seconds - (days * 24 * 60 * 60);
		int hours = remainseconds / 60 / 60;
		int remainseconds1 = remainseconds - (hours * 60 * 60);
		int minutes = remainseconds1 / 60;
		int finnalSeconds = remainseconds1 - (minutes * 60);
		System.out.println(days + "天" + hours + "時" + minutes + "分" + finnalSeconds + "秒");
//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi = 3.1415;
		double area = pi * 5 * 5;
		double circumference = pi * 10;
//		System.out.println("圓面積="+area);
		System.out.printf("圓面積=%.4f", area);
		System.out.println("");
//		System.out.println("圓周長="+circumference);
		System.out.printf("圓周長=%.4f", circumference);
		System.out.println("");
//• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//金加利息共有多少錢 (用複利計算,公式請自行google)FV = PV * (1 + i)^n
//		本利和(FV)：: 也就是期末的金額，包括了本金和累積的利息。
//		本金(PV)：: 最初投資的金額。
//		年利率(i)：: 銀行每年收取的利息率，通常以百分比表示，例如5%。
//		期數(n)：: 投資的年限，例如3 年。
		double pv = 1500000;
		double fv = pv * Math.pow(1.02, 10);
		System.out.println("本金加利息=" + fv + "元");
//		System.out.printf("本金加利息="+"%.0f", fv);
//		System.out.print("元");
//		System.out.println("");
		double money = 1500000;
		for (int i = 1; i <= 10; i++) {
			money = money + (money * 0.02);
		}
		System.out.println("本金加利息=" + money + "元");
//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		// 5 + 5
		// 5 + ‘5’
		// 5 + “5”
//並請用註解各別說明答案的產生原因
		System.out.println(5 + 5); // 10，純數字相加
		System.out.println(5 + '5');// 58,數字加上字元'5' asc表轉換
		System.out.println(5 + "5");// 55,數字加上字串拼接
	}
}
