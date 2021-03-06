package ch19;

/* 깊은 복사 (Deep Copy)
 * 실제 값을 새로운 메모리 공간에 복사하는 것을 의미
 * 참조하고 있는 실제값이 다름
 */

class Point3 implements Cloneable {
	private int xPos;
	private int yPos;
	
	public Point3 (int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPostion() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println();
	}
	
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}


class Rectangle3 implements Cloneable {
	private Point3 upperLeft;	// 좌측 상단 좌표
	private Point3 lowerRight;	// 우측 하단 좌표
	
	public Rectangle3 (int x1, int y1, int x2, int y2) {
		upperLeft = new Point3(x1, y1);
		lowerRight = new Point3(x2, y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) {		// 좌표 정보 수정
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// Object 클래스의 clone 메소드 호출을 통한 복사본 생성
		Rectangle3 copy = (Rectangle3)super.clone();
		
		// 깊은 복사의 형태로 복사본을 완성
		copy.upperLeft = (Point3)upperLeft.clone();
		copy.lowerRight = (Point3)lowerRight.clone();
		
		// 완성된 복사본의 참조 값 반환
		return copy;
	}
	
	public void showPosition() {	// 직사각형 좌표 정보 출력
		System.out.print("좌측 상단 : ");
		upperLeft.showPostion();
		
		System.out.print("우측 하단 : ");
		lowerRight.showPostion();
	}	
}


public class DeepCopy {
	public static void main(String[] args) {
		Rectangle3 org = new Rectangle3(1, 1, 9, 9);
		Rectangle3 cpy;
		
		try {
			cpy = (Rectangle3)org.clone();	// 인스턴스 복사
			org.changePos(2, 2, 7, 7);		// 인스턴스 좌표 정보 수정
			
			System.out.println("---- org 좌표 ----");
			org.showPosition();
			
			System.out.println("---- cpy 좌표 ----");
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
