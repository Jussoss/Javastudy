package ch12;

import java.util.ArrayList;
class Fruit5		        { public String toString() { return "Fruit";}}
class Apple5 extends Fruit5 { public String toString() { return "Apple";}}
class Grape5 extends Fruit5 { public String toString() { return "Grape";}}
// [12-2] ���׸� �޼��� makeJuice()�� �Ʒ��� ���� ���ǵǾ� ���� ��, �� �޼��带 �ùٸ���
// ȣ���� ������ ��� ���ÿ�. (Apple�� Grape�� Fruit�� �ڼ��̶�� ��������.)

public class Ex12_2 {
	public static void main(String[] args) {
		// ���� �κ�
		// Juicer5.<Apple5>makeJuice5(new FruitBox5<Fruit5>()); // Ÿ�� ����ġ
		// Juicer5.<Fruit5>makeJuice5(new FruitBox5<Grape5>()); // Ÿ�� ����ġ
		Juicer5.<Fruit5>makeJuice5(new FruitBox5<Fruit5>());
		Juicer5.makeJuice5(new FruitBox5<Apple5>());
		// Juicer5.makeJuice5(new FruitBox5<Object5>()); // Ÿ���� ��ġ�ϳ� <T extends Fruit>�� ������ �ɷ������Ƿ� ����.
	}
}

class Juicer5 {
	static <T extends Fruit5> String makeJuice5(FruitBox5<T> box) {
		String tmp = "";
		
		for(Fruit5 f : box.getList()) // box�� �ִ� List���� ������ f�� ����
			tmp += f + " "; // ���ڿ� ����
		return tmp; // ArrayList<T> ��ȯ
		}
}

class FruitBox5<T extends Fruit5> extends Box5<T> {}

class Box5<T> { //class FruitBox5<T extends Fruit5>�� �ڼ�
		ArrayList<T> list = new ArrayList<T>();
		ArrayList<T> getList() { return list;  } // getList ��ȯ
}


