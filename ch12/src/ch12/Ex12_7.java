package ch12;
// [12-7] �ֳ����̼� TestInfo�� ������ ���� ���ǵǾ� ���� ��, �� �ֳ����̼��� �ùٸ���
// ������� ���� ����?

@interface TestInfo {
	int count() default 1;
	String[] value() default "aaa";
}


// @TestInfo // default ���� ���� �Ǿ� �־ ���� ���� @TestInfo(count=1)�� ����
// @TestInfo(1) // @TestInfo(count=1)�� ����
// @TestInfo("bbb") // @TestInfo(count=1, value={"bbb"})�� ����
// @TestInfo("bbb","ccc") // @TestInfo({"bbb", "ccc"})�� ���� �����
public class Ex12_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}