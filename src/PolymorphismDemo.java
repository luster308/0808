/*
 * Polymorphism의 조건
 * 1. Method's Override
 * 2. Object Cast(객체 형변환)
 * 		1)Value Type
 * 			a. 자동형변환, Implicit conversion, Promotion: 작은 쪽에서 큰 쪽으로(小 -> 大)
 * 			b. 강제형변환, Explicit conversion, Demotion: 大 -> 小, ()연산자를 사용
 * 		2) Object Type
 * 			a. 자동형변환, Implicit conversion, Promotion, Cast up: 자식 -> 부모
 * 			b. 강제형변환, Explicit conversion, Demotion, Cast down: 부모 -> 자식(강제적 형변환만 가능하며, 될 때도 있고 안될 때도 있다.)
 */
public class PolymorphismDemo {
	public static void main(String[] args) {
//		Test t = new Test();
//		Demo d = new Demo();
		Test t = new Demo();   // 자식 주소를 부모에게
		
//		if(t instanceof Demo) {   // instanceof: 부모 객체가 자식 객체로 형변환이 가능한지 여부 판단.
//			d = (Demo)t;
//		}else {
//			System.out.println("형변환 불가능");
//		}
	}
}

class Test{}   // 부모
class Demo extends Test{}   // 자식