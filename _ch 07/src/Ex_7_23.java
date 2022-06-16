/*문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시오.
 * 
 * 메서드명 : sumArea
기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
반환타입 : double
매개변수 : Shape[] arr*/


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
		System.out.println("면적의 합:"+sumArea(arr));
		}
}
/*
 * 반복문으로 넘겨받은 객체배열(arr)의 객체들에 대해 calcArea()를 호출하여 면적을 구하고 누적해서 반환하도록 작성하면 된다. 
 * Shape타입의 배열에는 Shape의 자손 인스턴스가 들어있기 때문에, 
 * Shape클래스의 추상메 서드 calcArea()를 호출해도 실제로는 각 인스턴스에 완전히 구현된 calcArea()가 호출된다.
 */