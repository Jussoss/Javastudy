package ch12;

import java.util.ArrayList;

// [12-4] �Ʒ��� �޼���� �� ���� ArrayList�� �Ű������� �޾Ƽ�, �ϳ��� ���ο�
// ArrayList�� �����ϴ� �޼����̴�. �̸� ���׸� �޼���� �����Ͻÿ�.
public class Ex12_4 {
	public static ArrayList<? extends Product7> merge(
			ArrayList<? extends Product7> list, ArrayList<? extends Product7> list2) {
			ArrayList<? extends Product7> newList = new ArrayList<>(list);
				
			newList.addAll(list2);
				
			return newList;
			}
			
	/*
	 * public static <T extends Product7> ArrayList<T> merge( 
	 * ArrayList<T> list, ArrayList<T> list2) { 
	 * ArrayList<T> newList = new ArrayList<>(list);
	 * 
	 * newList.addAll(list2);
	 * 
	 * return newList; 
	 * }
	 */
	
}

class Product7 {}