package ch30;

/* 스트림의 최종 연산 (allMatch, anyMatch, noneMatch) */

import java.util.stream.IntStream;

class Stream_Match {
	public static void main(String[] args) {
		boolean b = IntStream.of(1, 2, 3, 4, 5)
				             .allMatch(n -> n % 2 == 0);
		System.out.println("모두 짝수인가요? " + b);

		b = IntStream.of(1, 2, 3, 4, 5)
				     .anyMatch(n -> n % 2 == 0);
		System.out.println("짝수가 하나는 있나요? " + b);
		
		b = IntStream.of(1, 2, 3, 4, 5)
				     .noneMatch(n -> n % 2 == 0);
		System.out.println("모두 짝수가 아닌가요? " + b);
	}
}