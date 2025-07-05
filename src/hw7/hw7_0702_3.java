package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class hw7_0702_3 {
//	• 請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案

	public void copyFile(String x, String y) {
		try (FileInputStream fis = new FileInputStream(x);
				BufferedInputStream bis = new BufferedInputStream(fis);

				FileOutputStream fos = new FileOutputStream(y);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			byte[] buffer = new byte[4096];
			int bytesRead;
			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			System.out.println("讀取檔案發生錯誤");
		}
	}

	public static void main(String[] args) throws IOException {
		String FilePath = "c:\\javawork\\Sample.txt"; 
		String copyFilePath = "c:\\javawork\\Sample_copy.txt"; 

		hw7_0702_3 copyFile = new hw7_0702_3();

		copyFile.copyFile(FilePath, copyFilePath);
	}
}
