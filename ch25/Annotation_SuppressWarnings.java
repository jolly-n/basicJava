package ch25;

/* 어노테이션 (SuppressWarnings) 
 * 컴파일러가 경고 메세지를 전달하는 특정 상황에서,
 * 관련 경고 메세지를 생략하라는 의미
 */

interface Viewable3 {
	@Deprecated
	public void showIt(String str);
	public void brShowIt(String str);
}

class Viewer3 implements Viewable3 {
	@Override
	@SuppressWarnings("deprecation") // deprecation과 관련된 경고 메세지 생략 요청
	public void showIt(String str) {
		System.out.println(str);
	}
	
	@Override
	public void brShowIt(String str) {
		System.out.println('[' + str + ']');
	}
}

class Annotation_SuppressWarnings {
	public static void main(String[] args) {
		Viewable3 view = new Viewer3();
		view.showIt("Hello Annotations");
		view.brShowIt("Hello Annotations"); // 컴파일러가 경고하는 문장
	}
}