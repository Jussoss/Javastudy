package artifactTest;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class MyTv { 
	
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	void turnOnOff() {
		// (1) isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
		isPowerOn = !isPowerOn; // ������������ !
		}
	
	void volumeUp() {
		// (2) volume�� ���� MAX_VOLUME���� ���� ���� ���� 1������Ų��.
		if(volume < MAX_VOLUME)
			volume++;
		}
		
	void volumeDown() {
		// (3) volume�� ���� MIN_VOLUME���� Ŭ ���� ���� 1���ҽ�Ų��.
		if(volume > MIN_VOLUME)
			volume--;
		}
		
	void channelUp() {
		// (4) channel�� ���� 1������Ų��.
		// ���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
		if(channel==MAX_CHANNEL) {
				channel = MIN_CHANNEL;
			} else {
			channel++;
			}
		}
		
	void channelDown() {
		// (5) channel�� ���� 1���ҽ�Ų��.
		// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
		if(channel==MIN_CHANNEL) {
			
			assertTrue(channel==MIN_CHANNEL); // ���� A�� ������ Ȯ���Ѵ�.
			assertEquals(channel, MIN_CHANNEL); // x(���� ��)�� y(���� ��)�� ������ �׽�Ʈ ���
			
			channel = MAX_CHANNEL;
			} else {
			channel--;
			}
		}
	
	} // class MyTv
	
public class JUnitTest3 {
			@Test
			@DisplayName("Tv")
			void Test() {
				MyTv t = new MyTv();
				
				assertNotNull(t); // ��üt�� null�� �ƴ��� Ȯ��
				// assertNull(t); ��üt�� null���� Ȯ��
				
				t.channel = 100;
				t.volume = 0;
				System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
				
				assertEquals(t.channel, 100);
				assertEquals(t.volume, 0);
				
				t.channelDown();
				t.volumeDown();
				System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
				
				assertEquals(t.channel, 99); 
				assertEquals(t.volume, 0);
				
				t.volume = 100;
				t.channelUp();
				t.volumeUp();
				System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
				
				assertEquals(t.channel, 100);
				assertEquals(t.volume, 100);
			}
			
} // class JUnitTest3

