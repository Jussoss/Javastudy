/*����7-22���� ������ Ŭ�������� ������ ���ϴ� �޼��带 �ۼ��ϰ� �׽�Ʈ �Ͻÿ�.
 * 
 * �޼���� : sumArea
�� �� : �־��� �迭�� ��� �������� ���̸� ��� ���ؼ� ��ȯ�Ѵ�.
��ȯŸ�� : double
�Ű����� : Shape[] arr*/


public class Ex_7_23 {
	/*
	 * static double sumArea(Shape[] arr) { 
	 * double sum = 0; 
	 * 
	 * for(int i=0; i < arr.length;i++) 
	 * 		sum+= arr[i].calcArea(); 
	 * 
	 * return sum;
	 */
}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("������ ��:"+sumArea(arr));
		}
}
/*
 * �ݺ������� �Ѱܹ��� ��ü�迭(arr)�� ��ü�鿡 ���� calcArea()�� ȣ���Ͽ� ������ ���ϰ� �����ؼ� ��ȯ�ϵ��� �ۼ��ϸ� �ȴ�. 
 * ShapeŸ���� �迭���� Shape�� �ڼ� �ν��Ͻ��� ����ֱ� ������, 
 * ShapeŬ������ �߻�� ���� calcArea()�� ȣ���ص� �����δ� �� �ν��Ͻ��� ������ ������ calcArea()�� ȣ��ȴ�.
 */