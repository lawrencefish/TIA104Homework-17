package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HW8_1 {
	public static void main(String[] args) {
		List list = new ArrayList();

		list.add(100); // Integer(100)
		list.add(3.14d); // Double(3.14)
		list.add(21L); // Long(21L)
		list.add((short) 100); // Short(“100”)
		list.add(5.1d); // Double(5.1)
		list.add("Kitty"); // "Kitty"
		list.add(100); // Integer(100) (重複項)
		list.add(new Object()); // Object物件
		list.add("Snoopy"); // "Snoopy"
		list.add(new BigInteger("1000")); // BigInteger(“1000”)
//		// Iterator
//		Iterator it = list.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		// 傳統for
//		System.out.println();
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		// for each
//		for (Object obj : list) {
//			System.out.println(obj);
//		}
		
		// 移除不是number的物件
		Iterator itn = list.iterator();
		while (itn.hasNext()) {
			Object oj = itn.next();
			if(!(oj instanceof Number)) {
				itn.remove();
			}
		}
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
