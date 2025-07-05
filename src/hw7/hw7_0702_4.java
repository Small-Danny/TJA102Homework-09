package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class hw7_0702_4 {
//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//
//	• 承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//	型簡化本題的程式設計)
	public static void main(String[] args) {
		// 定義資料夾，定義路徑
		String filePath = "C:\\data";
		String Objectpath = "C:\\data\\Object.ser";
		File file = new File(filePath);
		// 檢查資料夾是否存在

		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("資料夾已成功創建");
			} else {
				System.out.println("資料夾無法創建");
			}
		} else {
			System.out.println("資料夾已存在");
		}

	// 創建4個物件
	Cat cat1 = new Cat("柚子");
	Cat cat2 = new Cat("西瓜");
	Dog dog1 = new Dog("旺財");
	Dog dog2 = new Dog("來財");
	try(
			FileOutputStream fos=new FileOutputStream(Objectpath);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			)
	{
		oos.writeObject(cat1);
		oos.writeObject(cat2);
		oos.writeObject(dog1);
		oos.writeObject(dog2);
		System.out.println("物件已成功序列化'" + Objectpath + "'。");
	}
	catch(IOException e) {
		System.err.println("物件序列化失敗:"+e.getMessage());
		e.printStackTrace();
	}

	try(
			FileInputStream fis=new FileInputStream(Objectpath);
			ObjectInputStream ois=new ObjectInputStream(fis);
			){
		List<Animal>animals=new ArrayList<>();
		animals.add((Animal)ois.readObject());
		animals.add((Animal)ois.readObject());
		animals.add((Animal)ois.readObject());
		animals.add((Animal)ois.readObject());
		for(Animal animal:animals) {
			animal.speak();
		}
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}