package hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HW7_2 {
//	請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡
//	(請使用append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		File f = new File("C:\\TIA104_Workspace\\Homework_17\\src\\hw7\\Data.txt"); // 目錄物件
		if (!f.exists()) {
			try {
				f.createNewFile();
//				System.out.println("建立Data.txt成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
//			System.out.println("Data.txt已經存在");
		}
		//取亂數
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != 10) {
			int i = (int) (Math.random() * 1000) + 1;
			set.add(i);
		}
		
		try {
			FileWriter fw = new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			Iterator<Integer> objs = set.iterator();
			while (objs.hasNext()) {
				pw.write(objs.next()+ "\t");
			}
			pw.println();

			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
