package hw1;
import java.util.Scanner;
public class Hw4_0620_3 {
//	請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	//思路先判斷是否為閏年，創造一個方法判斷
//	計算輸入的年份是否為閏年，其條件為：
//	  １.不可被4整除者為平年。
//	  ２.可被4整除且不為100整除者為閏年。
//	  ３.可被400整除為閏年。
//	  ４.可被1000整除為閏年。
	public static boolean OrLeapYear (int inputyear) {
		return(inputyear%1000 ==0 || inputyear %400 ==0 || (inputyear % 4 ==0 && inputyear % 100 !=0)) ;
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int inputyear;
		int inputmonth;
		int inputday;
	//先輸入驗證年分
		System.out.println("請輸入西元年:");
		inputyear=sc.nextInt(); 
		boolean a =OrLeapYear(inputyear);//ture是閏年，false是平年
	//判斷月份，是否為1~12月，要創造無窮迴圈，輸入錯誤就繼續詢問
		while(true) {
			System.out.println("請輸入月(範圍1-12):");
			inputmonth=sc.nextInt();
			if(inputmonth >0 && inputmonth<13) {
				break;
			}
			else {
				System.out.println("輸入錯誤，請重新輸入月(範圍1-12)");
			}
		}
	//創造一個陣列，儲存各自月的最大日，如果是閏年，把陣列2月的28數值存成29
		int day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	    if(a) {day[2]=29;}
	//比對是否在陣列的值，然後計算當年的哪一個月，便利相加，再加上最後輸入的日子
	    while(true) {
			System.out.println("請輸入日期:");
			inputday=sc.nextInt();
		if(inputday>0 && inputday<= day[inputmonth]) {
			break;
		}
		else {
				System.out.println("輸入錯誤，請重新輸入符合日期");
			}
		}
	    //計算現在是當年的哪一天，遍歷相加，要小於自己的月，最後再加上輸入的day
	    int sumday=0;
	    for(int i=0;i<inputmonth;i++) {
	    	sumday=sumday+day[i];
	    }
	    sumday=sumday+inputday;
	//打印
	    System.out.println("您輸入的是西元"+inputyear+"年"+inputmonth+"月"+inputday+"日");
	    if (a) {System.out.println("是閏年");
	    }
	    else {System.out.println("是平年");
	}
	    System.out.println("是"+inputyear+"年的第"+sumday+"天");
	    sc.close();
	}
}
