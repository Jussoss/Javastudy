package ch12;
// [12-1] Ŭ���� Box�� ������ ���� ���ǵǾ� ���� ��, ���� �� ������ �߻��ϴ� ������?
// ��� �߻��ϴ� ������?
public class Ex12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �κ�
		// Box1<Object> b = new Box1<String>(); // ����. ���Ե� Ÿ���� �ݵ�� ���ƾ� �Ѵ�.
		// Box1<Object> b = (Object)new Box1<String>(); // ����. ObjectŸ���� Box<Object>Ÿ���� ���������� ����Ұ�.(Ÿ�� ����ġ)
		// new Box1<String>().setItem(new Object()); // ����. ���Ե� Ÿ���� String�̹Ƿ�, setItem(T item)�� �Ű����� ����, StringŸ�Ը� ���ȴ�.
		new Box1<String>().setItem("ABC"); // ���Ե� Ÿ���� String�� ��ġ�ϴ� Ÿ���� �Ű������� �����߱� ������ OK.
	}

}

class Box1<T> { // ���׸� Ÿ�� T�� ����
	T item;
	
	void setItem(T item) { this.item = item; }
	T getItem() { return item; }
}