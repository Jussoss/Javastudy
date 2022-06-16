/*�Ʒ��� ������ ������ ShapeŬ�����̴�. �� Ŭ������ �������� �ϴ� CircleŬ��
���� RectangleŬ������ �ۼ��Ͻÿ�. �� ��, �����ڵ� �� Ŭ������ �°� ������ �߰��ؾ�
�Ѵ�.
(1) Ŭ������ : Circle
����Ŭ���� : Shape
������� : double r - ������

(2) Ŭ������ : Rectangle
����Ŭ���� : Shape
������� : double width - ��
double height - ����

�޼��� :
1. �޼���� : isSquare
�� �� : ���簢������ �ƴ����� �˷��ش�.
��ȯŸ�� : boolean
�Ű����� : ����*/

abstract class Shape {
	Point p;
	
	Shape() {
this(new Point(0,0));
}
	
Shape(Point p) {
this.p = p;
}


abstract double calcArea(); // ������ ������ ����ؼ� ��ȯ�ϴ� �޼���

Point getPosition() {
	return p;
	}

	void setPosition(Point p) {
		this.p = p;
	}
}

/*
 * class Rect extends Shape { 
 * 		double width; 
 * 		double height; 
 * 
 * 		Rect(double width, double height) { 
 * 			this(new Point(0,0), width, height); 
 * 		} 
 * 
 * Rect(Point p, double width, double height) { 
 * 		super(p); // ������ ����� ������ �����ڰ� �ʱ�ȭ�ϵ��� �Ѵ�. 
 * 		this.width = width; 
 * 		this.height = height; 
 * 		} 
 * 
 * boolean isSquare() {  ��ȯŸ�� : boolean
 * 		// width�� height�� 0�� �ƴϰ� width�� height�� ������ true�� ��ȯ�Ѵ�. 
 * 		return width*height!=0 && width==height; 
 * 		}
 * 
 * double calcArea() { 
 * 		return width * height; 
 * 		} 
 * } 
 * 
 * class Circle extends Shape { ������� : double r - ������
 * 		double r; // ������
 * 
 * Circle(double r) { 
 * 		this(new Point(0,0),r); // Circle(Point p, double r)�� ȣ�� }
 * 
 * Circle(Point p, double r) { 
 * 		super(p); // ������ ����� ������ �����ڰ� �ʱ�ȭ�ϵ��� �Ѵ�. 
 * 		this.r = r; 
 * }
 * 
 * double calcArea() { 
 * 		return Math.PI * r * r; 
 * 		} 
 * }
 */

class Point {
	int x;
	int y;
Point() {
		this(0,0);
	}
Point(int x, int y) {
		this.x=x;
		this.y=y;
	}

public String toString() {
		return "["+x+","+y+"]";
	}
}

public class Ex_7_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
