package ch12;
// [12-7] 애너테이션 TestInfo가 다음과 같이 정의되어 있을 대, 이 애너테이션이 올바르게
// 적용되지 않은 것은?

@interface TestInfo {
	int count() default 1;
	String[] value() default "aaa";
}


// @TestInfo // default 값이 지정 되어 있어서 생략 가능 @TestInfo(count=1)과 동일
// @TestInfo(1) // @TestInfo(count=1)이 맞음
// @TestInfo("bbb") // @TestInfo(count=1, value={"bbb"})과 동일
// @TestInfo("bbb","ccc") // @TestInfo({"bbb", "ccc"})와 같이 써야함
public class Ex12_7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}