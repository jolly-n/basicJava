package ch20;

/* 래퍼 클래스의 static 메소드 */

class WrapperClassStaticMethod {
	public static void main(String[] args) {
		/* 인스턴스를 생성해주는 클래스 메소드 */
		Integer n1 = Integer.valueOf(5);	// 숫자 기반 Integer 인스턴스 생성
		Integer n2 = Integer.valueOf("1024");	// 문자열 기반 Integer 인스턴스 생성
		
		/* 대소 비교와 합을 계산하는 클래스 메소드 */
		System.out.println("큰 수: " + Integer.max(n1, n2));
		System.out.println("작은 수: " + Integer.min(n1, n2));
		System.out.println("합: " + Integer.sum(n1, n2) );
		System.out.println();
		
		/* 정수에 대한 2진, 8진, 16진수 표현 결과를 반환하는 클래스 메소드 */
		System.out.println("12의 2진 표현: " + Integer.toBinaryString(12));
		System.out.println("12의 8진 표현: " + Integer.toOctalString(12));
		System.out.println("12의 16진 표현: " + Integer.toHexString(12));
	}
}
