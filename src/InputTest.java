import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InputTest {
	private Student [] array;
	private Input input;

	@Before
	public void init() {
		array = new Student[12];
		String path = "C:/Temp/sungjuk_utf8.dat";
		input = new Input(array, path);
	}
	
	@Test
	public void testInput() {
		this.input.fileInput();
		for(Student student:this.array) {
			System.out.println(student);   // student.toString()이 출력된다.
		}
//		assertEquals("한송이", this.array[0].getName());
//		assertEquals((89+97+78+88),
//				(this.array[11].getKor()+this.array[11].getEng()+this.array[11].getMat()+this.array[11].getEdp()));
	}

}
