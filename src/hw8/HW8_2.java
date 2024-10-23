package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW8_2 {
	public static void main(String[] args) {
		Set<Train> trainSet = new HashSet<Train>();

		// 建立 7 個 Train 物件，並加入到 trainList 中
		trainSet.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainSet.add(new Train(118, "自強", "高雄", "台北", 500));
		trainSet.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainSet.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainSet.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainSet.add(new Train(1254, "區間", "屏東", "基隆", 700)); // 重複的班次

		// 將 Set 轉為 List 以便排序
        List<Train> trainList = new ArrayList<>(trainSet);

        // 使用 Collections.sort 進行排序 (因為 Train 已經實作了 Comparable)
        Collections.sort(trainList);
		
		// 輸出 trainList 中的 Train 物件資訊
		for (Train train : trainList) {
            System.out.println(train.toString());
        }
	}
}