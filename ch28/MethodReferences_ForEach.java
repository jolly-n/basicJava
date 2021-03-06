package ch28;

import java.util.Arrays;
import java.util.List;

/* forEach 메소드 */

class MethodReferences_ForEach {
	public static void main(String[] args) {
		List<String> ls = Arrays.asList("Red", "Black");
		
		ls.forEach(s -> System.out.println(s)); // 람다식 기반
		ls.forEach(System.out::println); // 메소드 참조 기반
	}
}