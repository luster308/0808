/*
 * 메소드의 오버라이드 조건
 * 1. 메소드의 시그니처가 같은가?
 * 	- 메소드의 필수 3요소(이름, 괄호, 리턴타입)
 * 2. 접근 제한자(Access Modifier)의 관계
 * 	- private < package < protected < public
 */
public class OverrideDemo {
	public static void main(String[] args) {
		Jasik jasik = new Jasik();
		jasik.makeMoney();
	}
}
