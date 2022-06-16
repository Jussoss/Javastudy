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
		// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
		isPowerOn = !isPowerOn; // 논리부정연산자 !
		}
	
	void volumeUp() {
		// (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
		if(volume < MAX_VOLUME)
			volume++;
		}
		
	void volumeDown() {
		// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
		if(volume > MIN_VOLUME)
			volume--;
		}
		
	void channelUp() {
		// (4) channel의 값을 1증가시킨다.
		// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
		if(channel==MAX_CHANNEL) {
				channel = MIN_CHANNEL;
			} else {
			channel++;
			}
		}
		
	void channelDown() {
		// (5) channel의 값을 1감소시킨다.
		// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
		if(channel==MIN_CHANNEL) {
			
			assertTrue(channel==MIN_CHANNEL); // 조건 A가 참인지 확인한다.
			assertEquals(channel, MIN_CHANNEL); // x(예상 값)와 y(실제 값)가 같으면 테스트 통과
			
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
				
				assertNotNull(t); // 객체t가 null이 아닌지 확인
				// assertNull(t); 객체t가 null인지 확인
				
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

