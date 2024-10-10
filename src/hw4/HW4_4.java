package hw4;

public class HW4_4 {
//	班上有8位同學，他們進行了6次考試結果如下：
//		1	2	3	4	5	6	7	8
//	1	10	35	40	100	90	85	75	70
//	2	37	75	77	89	64	75	70	95
//	3	100	70	79	90	75	70	79	90
//	4	77	95	70	89	60	75	85	89
//	5	98	70	89	90	75	90	89	90
//	6	90	80	100	75	50	20	99	75
//	請算出每位同學考最高分的次數
//	(提示：二維陣列)
	public static void main(String[] args) {
        //宣告陣列
		int[][] scores = {
            {10, 35, 40, 100, 90, 85, 75, 70},
            {37, 75, 77, 89, 64, 75, 70, 95},
            {100, 70, 79, 90, 75, 70, 79, 90},
            {77, 95, 70, 89, 60, 75, 85, 89},
            {98, 70, 89, 90, 75, 90, 89, 90},
            {90, 80, 100, 75, 50, 20, 99, 75}
        };
		//用來計算第一名次數的陣列
        int[] student = new int[8];
        //最高分的暫存值
        int maxScores = 0;
        //外層一個大for，內層兩個小for
        //外層大for跑6次考次迴圈
        for(int i=0; i<scores.length; i++) {
        	//第一圈小for抓單次考試最大值
        	for(int j=0; j<student.length; j++) {
        		if(scores[i][j] > maxScores) {
        			maxScores = scores[i][j];
        		}
        	}
        	//第二圈小for，最高分的同學就++
        	for(int j=0; j<student.length; j++) {
        		if(scores[i][j] == maxScores) {
        			student[j]++;
        		}
        	}
        	//一次考試跑完，讓暫存值歸0
        	maxScores = 0;
        }
        //輸出每位同學考最高分的次數
        for(int i=0; i<student.length; i++) {
        	System.out.println(i+1 + "號得第一的次數是" + student[i]);
        }
    }
}
