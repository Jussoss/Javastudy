package ch12;
// [12-3] ���� �� �ùٸ��� ���� ������ ��� ���ÿ�.
public class Ex12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Box6<?> b = new Box6(); // ������ ���� ������ <>�� �ٿ��ִ� ���� ����
		// Box6<?> b = new Box6<>(); // <>�� �����ϸ� ���������� Ÿ�԰� ���� Ÿ������ ���ֵ�
		// Box6<?> b = new Box6<Object>(); // ����. T�� Fruit6�� �ڼ����� ���ѵǾ� �ֱ⶧��
		// Box6<Object> b = new Box6<Fruit6>(); // ����. Ÿ�� ����ġ
		// Box6 b = new Box6<Fruit6>(); // ��밡�������� �ٶ������� ����
		// Box6<? extends Fruit6> b = new Box6<Apple6>(); // ����. ����Ű�� Ŭ������ ����
		// Box6<? extends Object> b = new Box6<? extends Fruit6>(); // ����. new�����ڴ� Ÿ���� ��Ȯ�ؾ���
	}

}

class Box6<T extends Fruit6> { // ���׸� Ÿ�� T�� ����
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}

class Fruit6 {}
class Apple6 extends Fruit6 {}