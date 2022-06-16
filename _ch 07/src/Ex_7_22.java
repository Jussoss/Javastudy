/*아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래
스와 Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야
한다.
(1) 클래스명 : Circle
조상클래스 : Shape
멤버변수 : double r - 반지름

(2) 클래스명 : Rectangle
조상클래스 : Shape
멤버변수 : double width - 폭
double height - 높이

메서드 :
1. 메서드명 : isSquare
기 능 : 정사각형인지 아닌지를 알려준다.
반환타입 : boolean
매개변수 : 없음*/

abstract class Shape {
	Point p;
	
	Shape() {
this(new Point(0,0));
}
	
Shape(Point p) {
this.p = p;
}


abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드

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
 * 		super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다. 
 * 		this.width = width; 
 * 		this.height = height; 
 * 		} 
 * 
 * boolean isSquare() {  반환타입 : boolean
 * 		// width나 height가 0이 아니고 width와 height가 같으면 true를 반환한다. 
 * 		return width*height!=0 && width==height; 
 * 		}
 * 
 * double calcArea() { 
 * 		return width * height; 
 * 		} 
 * } 
 * 
 * class Circle extends Shape { 멤버변수 : double r - 반지름
 * 		double r; // 반지름
 * 
 * Circle(double r) { 
 * 		this(new Point(0,0),r); // Circle(Point p, double r)를 호출 }
 * 
 * Circle(Point p, double r) { 
 * 		super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다. 
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
