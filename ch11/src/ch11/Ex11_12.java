package ch11;
// [11-12] ������ ���ٰ��ӿ��� ī���� ������ �����ϴ� ��޸��(����)�̴�. HashMap��
// ��ް� ������ �����ϴ� registerJokbo()�� ������������ ������ ����ؼ� ��ȯ�ϴ�
// getPoint()�� �ϼ��Ͻÿ�.
// [����] ���ٰ����� �� ���� ī���� ���ڸ� ���� ���� 10���� ���� �������� ���� ���� �̱�� �����̴�.
// �� �ܿ��� Ư�� ���ڷ� ������ ī��� �̷���� ���(����)�� �־ ���� ����� ī�尡 �̱��.
/*
ī��1 ī��2 ����
K K 4000
10 10 3100
9 9 3090
8 8 3080
7 7 3070
6 6 3060
5 5 3050
4 4 3040
3 3 3030
2 2 3020
1 1 3010
- - -
*/
/*
ī��1 ī��2 ����
1 2 2060
2 1 2060
1 4 2050
4 1 2050
1 9 2040
9 1 2040
1 10 2030
10 1 2030
4 10 2020
10 4 2020
4 6 2010
6 4 2010
*/
import java.util.*;

public class Ex11_12 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SutdaDeck1 deck = new SutdaDeck1();
		
		deck.shuffle();
		Player1 p1 = new Player1("Ÿ¥", deck.pick(), deck.pick());
		Player1 p2 = new Player1("���", deck.pick(), deck.pick());
		
		System.out.println(p1+" "+deck.getPoint(p1));
		System.out.println(p2+" "+deck.getPoint(p2));
	}

}

class SutdaDeck1 {
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
	
	int pos = 0; // ������ ������ ī���� ��ġ
	HashMap jokbo = new HashMap(); // ������ ������ HashMap
	
	SutdaDeck1() {
		for(int i=0;i < cards.length;i++) {
			int num = i%10 + 1;
			boolean isKwang = i < 10 && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard1(num,isKwang);
		}
		registerJokbo(); // HashMap�� ����� ��ް� ������ ������ ����Ѵ�.
	}
	
	void registerJokbo() { // put()�� ȣ���ؼ� HashMap�� ���� ����
		jokbo.put("KK", 4000); // put(Object key, Object value)
		
		jokbo.put("1010",3100);
		jokbo.put("99", 3090);
		jokbo.put("88", 3080);
		jokbo.put("77", 3070);
		jokbo.put("66", 3060);
		jokbo.put("55", 3050);
		jokbo.put("44", 3040);
		jokbo.put("33", 3030);
		jokbo.put("22", 3020);
		jokbo.put("11", 3010);
		
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("104", 2020);
		jokbo.put("410", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
		}
	
		int getPoint(Player1 p) {
			if(p==null) return 0;
			
			SutdaCard1 c1 = p.c1;
			SutdaCard1 c2 = p.c2;
			
			Integer result = 0; // Integer result = new Integer(0);
			
			// �����κ�
			// 1. ī�� �� ���� ��� ���̸�, jokbo���� Ű�� "KK"�� �ؼ� ������ ��ȸ�Ѵ�.
			if(c1.isKwang && c2.isKwang) {
				result = (Integer)jokbo.get("KK");
			} else {
			// 2. �� ī���� ����(num)�� jokbo���� ����� ��ȸ�Ѵ�.
				result = (Integer)jokbo.get(""+c1.num+c2.num);
			
			// 3. �ش��ϴ� ����� ������, �Ʒ��� �������� ������ ����Ѵ�.
			// (c1.num + c2.num) % 10 + 1000
				if(result==null) {
					result = new Integer((c1.num + c2.num) % 10 + 1000);
				}
			}
			
			// 4. Player�� ����(point)�� ����� ���� �����Ѵ�.
			p.point = result.intValue();
			
			return result.intValue();
		}
		
		SutdaCard1 pick() throws Exception {
			SutdaCard1 c = null;
			
			if(0 <= pos && pos < CARD_NUM) {
			c = cards[pos];
			cards[pos++] = null;
			} else {
				throw new Exception("�����ִ� ī�尡 �����ϴ�.");
			}
			
			return c;
		}
		
		void shuffle() {
			for(int x=0; x < CARD_NUM * 2; x++) {
				int i = (int)(Math.random() * CARD_NUM);
				int j = (int)(Math.random() * CARD_NUM);
			
				SutdaCard1 tmp = cards[i];
				cards[i] = cards[j];
				cards[j] = tmp;
			}
		}
} // SutdaDeck1

class Player1 {
	String name;
	SutdaCard1 c1;
	SutdaCard1 c2;
	
	int point; // ī���� ��޿� ���� ���� - ���� �߰�
	
	Player1(String name, SutdaCard1 c1, SutdaCard1 c2) {
		this.name = name ;
		this.c1 = c1 ;
		this.c2 = c2 ;
	}
	
	public String toString() {
		return "["+name+"]"+ c1.toString() +","+ c2.toString();
	}
} // class Player1

class SutdaCard1 {
	int num;
	boolean isKwang;
	
	SutdaCard1() {
		this(1, true);
	}
	
	SutdaCard1(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
} // class SutdaCard1