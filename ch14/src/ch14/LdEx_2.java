package ch14;
import java.util.function.Function;
import java.util.function.Supplier;

public class LdEx_2 {

	public static void main(String[] args) {
// 		Supplier�� �Է�X, ���O
// 		Supplier<MyClass> f = () -> new MyClass();
// 		Supplier<MyClass> f = MyClass::new; // �޼��� ����. Ŭ�����̸�::�޼����̸�
		
		
//		�����ڿ� �޼��� ����
		Function<Integer, MyClass> f = (i) -> new MyClass(i); // ���ٽ�
// 		Function<Integer, MyClass> f = MyClass::new; // �޼�������. Ŭ�����̸�::�޼����̸�
	
		
		MyClass mc = f.apply(100);
		System.out.println(mc.iv); // 100
		System.out.println(f.apply(200).iv); // 200. ���� ��� ���� �� �ٷ�
		
// 		�迭�� �޼��� ����
		Function<Integer, int[]> f2 = (i) -> new int[i]; // ���ٽ�
//		Function<Integer, int[]> f2 = int[]::new; // �޼��� ����. �迭Ÿ��::new
		int [] arr = f2.apply(100);
		
		System.out.println("arr.length="+arr.length); // 100
		
	}

}

class MyClass {
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;
	}
}