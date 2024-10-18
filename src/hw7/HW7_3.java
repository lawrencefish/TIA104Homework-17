package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HW7_3 {
//請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，
//第一個參數所代表的檔案會複製到第二個參數代表的檔案
	public void copyFile(File f1, File f2) {
		int c;
		try {
			FileInputStream in = new FileInputStream(f1);
			FileOutputStream out = new FileOutputStream(f2);
			while ((c = in.read()) != -1) { // 讀到檔案的尾端時,read()會回傳-1
				out.write(c);
				System.out.flush();
			}
			System.out.print("複製成功");
			out.close();
			in.close();
		} catch (IOException e) {
			System.out.print("複製失敗");
		}
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\TIA104_Workspace\\Homework_17\\src\\hw7\\copyFile1.txt");
		File f2 = new File("C:\\TIA104_Workspace\\Homework_17\\src\\hw7\\copyFile2.txt");
		if (!f2.exists()) {
			try {
				f2.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		HW7_3 hw = new HW7_3();
		hw.copyFile(f1, f2);
	}
}
