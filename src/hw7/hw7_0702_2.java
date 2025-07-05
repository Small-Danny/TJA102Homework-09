package hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.xml.crypto.Data;

public class hw7_0702_2 {
	public static void main(String[] args) {
//		請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//				append功能讓每次執行結果都能被保存起來)
		Set<Integer> set = new HashSet();
		Boolean a = false;
		while (set.size()<10) {
			set.add((int) (Math.random() * 1000) + 1);
		}
		System.out.print(set);
		String filePath = "c:\\javawork\\Data.txt";
		File file = new File(filePath);
		try {
			FileWriter Data = new FileWriter(file, true);
			BufferedWriter da = new BufferedWriter(Data);
			PrintWriter pw = new PrintWriter(da);
			for(Integer number:set) {
				pw.println(number);
			}
			pw.flush();
			pw.close();
			da.close();
			Data.close();
		} catch (IOException e) {
			System.err.println("寫入檔案 (字元流) 時發生錯誤: " + e.getMessage());
		} 
	}
}
