package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class hw7_0702_1 {
//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//		Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
	public static void main(String[] args) {
		int sumbyte = 0;
		int sumchar = 0;
		int sumline = 0;
		String filePath="c:\\javawork\\Sample.txt";
		try {
			File file =new File(filePath); 
			sumbyte = (int) file.length();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str = br.readLine()) != null) {// readLine暫存一行
				sumchar = sumchar + str.length();
				sumline++;
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			System.out.println("讀取檔案發生錯誤");
		} finally {
			System.out.println("Sample.txt檔案共有" + sumbyte + "個位元組");
			System.out.println(sumchar + "個字元");
			System.out.println(sumline + "個列資料");

		}
	}
}
