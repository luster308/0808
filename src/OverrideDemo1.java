
public class OverrideDemo1 {

	public static void main(String[] args) {
		Point original = new Point(30, 50);
		Point another = new Point(30, 50);
//		if(original==another) System.out.println("같다.");   // ==은 비교대상의 주소가 같냐고 물어본다.(값 x)
//		else System.out.println("다르다.");
		if(original.equals​(another)) System.out.println("같다.");
		else System.out.println("다르다.");
	}

}
class Point{
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals​(Object obj) {
		Point child = (Point)obj;
		if(this.x==child.x&&this.y==child.y) return true;
		else  return false;
	}
	
}