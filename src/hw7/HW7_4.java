package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HW7_4 {
//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main(String[] args) {
		File f1 = new File("C:\\data");
		if (!f1.exists()) {
			f1.mkdir();
		}
		File f2 = new File("C:\\data\\Object.ser");
		if (!f2.exists()) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Dog dog1 = new Dog("狗1");
		Dog dog2 = new Dog("狗2");
		Cat cat1 = new Cat("貓1");
		Cat cat2 = new Cat("貓2");
		
		try (FileOutputStream fos = new FileOutputStream(f2);
	             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

	            // 將 Dog 和 Cat 物件寫入檔案
	            oos.writeObject(dog1);
	            oos.writeObject(dog2);
	            oos.writeObject(cat1);
	            oos.writeObject(cat2);

	            System.out.println("物件序列化並寫入到 C:\\data\\Object.ser 完成");

	        } catch (IOException e) {
	            System.out.println("檔案處理錯誤：" + e.getMessage());
	        }
	}
}
