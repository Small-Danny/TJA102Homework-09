package hw5;

import java.util.Random;

public class Hw5_0625_3 {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖:
	public static String genAuthCode() {
		Random random=new Random();
		char x [] =new char[8];
		for(int i=0;i<x.length;i++) {
			int a=random.nextInt(3);
			switch(a) {
			case 0:{
				x[i]=(char)(random.nextInt(10)+48);
				break;
			}
			case 1:{
				x[i]=(char)(random.nextInt(26)+65);
				break;
			}
			case 2:{
				x[i]=(char)(random.nextInt(26)+97);
				break;
			}
			}
		}
		return new String(x);
	}
		public static void main(String[] args) {
			 System.out.println("本次隨機產生的驗證碼為"+genAuthCode());
		}
	
}
