// Ŀ�ǵ�������� 2~9������ �� ���� ���ڸ� �޾Ƽ� �� ���ڻ����� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Ex9_11 {
	public static void main(String[] args) {
			int from = 0;
			int to = 0;
			
			try {
				if(args.length!=2)
					throw new Exception("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���.");
					from = Integer.parseInt(args[0]);
					to = Integer.parseInt(args[1]);
				if(!(2 <= from && from <= 9 && 2 <= to && to <= 9))
					throw new Exception("���� ������ 2�� 9������ ���̾�� �մϴ�.");
			} // try
			
			catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("USAGE : GugudanTest 3 5");
			System.exit(0);
			} // catch ��ȿ�� �˻� ���� ó��
			
			// to���� from�� ���� ũ�� �� ���� �ٲ۴�.
			if(from > to) {
				int tmp = from;
				from = to;
				to = tmp;
			}
			
			// from�ܺ��� to�ܱ��� ����Ѵ�.
			for(int i=from;i<=to;i++) {
				for(int j=1;j<=9;j++) {
					System.out.println(i+"*"+j+"="+i*j);
				}
			System.out.println();
			}
		} // main
} // Ex9_11