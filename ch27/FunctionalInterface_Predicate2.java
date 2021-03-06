package ch27;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* 함수형 인터페이스 (Predicate) */

class FunctionalInterface_Predicate2 {
	public static <T> void show(Predicate<T> p, List<T> li) {
		for (T n : li) {
			if (p.test(n))
				System.out.println(n);
		}
	}

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 3, 8, 10, 11);
		show(n -> n % 2 != 0, list1); // 홀수만 출력

		List<Double> list2 = Arrays.asList(-1.2, 3.5, -2.4, 9.5);
		show(n -> n > 0.0, list2); // 0.0보다 큰 수만 출력
	}
}