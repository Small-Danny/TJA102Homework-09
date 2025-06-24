package hw1;

import java.util.Scanner;

public class Hw4_0620_2 {
//	阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
//	請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共 3 人!」
	// 思路，創建一個二維陣列 儲存員工編號，身上現金
	// 鍵盤錄入金額，比較金額並統計數量，
	public static void main(String[] args) {
		int colleague[][] = { // 關鍵2*5的陣列
				{ 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入你要借的金額");
		int a = sc.nextInt();
		int count = 0;
		System.out.println("有錢可借的員工編號：");
		//這邊同事跟身上的錢是綁定的，我先比較錢,確定直接打印編號
		for (int i = 1; i < colleague.length; i++) {
			for (int j = 0; j < colleague[i].length; j++) {
				if (a <= colleague[i][j]) {
					System.out.print(colleague[0][j] + " ");
					count++;
				}
			}
		}
		System.out.print("共" + " " + count + " 人");
		System.out.println(" ");
		System.out.println("=================我是分隔線=================");

//    	• 班上有8位同學,他們進行了6次考試結果如下:
//    		請算出每位同學考最高分的次數
		// 先全部遍歷出來，找出單一陣列的最高分，要比較6次,屬於誰且+1
		//需要考慮同樣最高的情況
		int classmateScore[][] = { // 6*8的陣列
				{ 10, 35, 40, 100, 90, 54, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int classmateid[] = new int[9];//同學，有符合分數+1
		for (int i = 0; i < classmateScore.length; i++) {// i= 0 1 2 3 4 5
			int sorce = classmateScore[i][0];
			for (int j = 0; j < classmateScore[i].length; j++) {// j=0 1 2 3 4 5 6 7 8
				if (sorce < classmateScore[i][j]) {
					sorce = classmateScore[i][j];
				}
			}
			// i=0，第一次高分出來直到6次最高分
			// 統計8位同學，有出現相同分數次數+1，沒有為0次
			// 再遍歷一次成績，出現相同的就+1，最後再打印一次陣列統計同學的次數
			for (int z = 0; z <8; z++) {
				if(sorce == classmateScore[i][z]) {
					classmateid[z+1]=classmateid[z+1]+1;
				}
			}
		}
		for (int i = 1; i <= 8; i++) {
			System.out.println(i + "號同學最高分次數為" + classmateid[i] + "次");
		}
		sc.close();
	}

}
