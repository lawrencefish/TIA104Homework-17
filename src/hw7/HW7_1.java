package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HW7_1 {
//	請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
	public static void main(String[] args) {
		int i;
		int lineCount = 0;
		int charCount = 0;
		File mf = new File("C:\\TIA104_Workspace\\Homework_17\\src\\hw7\\Sample.txt");
		System.out.println(+ mf.length() + "個位元組");

		try {
			FileReader fr = new FileReader(mf);
			BufferedReader br = new BufferedReader(fr);
			
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++; // 每讀取一行，行數加一
                charCount += line.length(); // 每行的字元數加到總數
            }

			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(charCount+"個字元");
		System.out.println(lineCount+"列資料");
		
	}
}
