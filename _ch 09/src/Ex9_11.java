// 커맨드라인으로 2~9사이의 두 개의 숫자를 받아서 두 숫자사이의 구구단을 출력하는 프로그램을 작성하시오.

public class Ex9_11 {
	public static void main(String[] args) {
			int from = 0;
			int to = 0;
			
			try {
				if(args.length!=2)
					throw new Exception("시작 단과 끝 단, 두 개의 정수를 입력해주세요.");
					from = Integer.parseInt(args[0]);
					to = Integer.parseInt(args[1]);
				if(!(2 <= from && from <= 9 && 2 <= to && to <= 9))
					throw new Exception("단의 범위는 2와 9사이의 값이어야 합니다.");
			} // try
			
			catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
			} // catch 유효성 검사 예외 처리
			
			// to보다 from의 값이 크면 두 값을 바꾼다.
			if(from > to) {
				int tmp = from;
				from = to;
				to = tmp;
			}
			
			// from단부터 to단까지 출력한다.
			for(int i=from;i<=to;i++) {
				for(int j=1;j<=9;j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
			System.out.println();
			}
		} // main
} // Ex9_11