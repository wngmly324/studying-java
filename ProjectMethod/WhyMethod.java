import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {

		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		// 100000000
		 			 // 인자, argument
// 		printTwoTimes("a", "-");
		// 100000000
//		printTwoTimes("a", "*");
//		writeFileTwoTimes("a", "*");
		// 100000000
//		printTwoTimes("a", "&");
//		Email.send("egoing@a.com","two times a", twoTimes("a", "&"));
//		printTwoTimes("b", "!");

	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
	}
									// 매개변수, parameter
//	public static void printTwoTimes(String text, String delimiter) {
//		System.out.println(delimiter);
//		System.out.println(text);
//		System.out.println(text);
//	}
	
//	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
//		FileWriter fw = new FileWriter("output.txt");
//		fw.write(delimiter+"\n");
//		fw.write(text+"\n");
//		fw.write(text+"\n");
//		fw.close();
//		
//	}

}

/*
 * 출처
 * 생활코딩, "JAVA method - 3. 메소드의 기본 형식", https://www.youtube.com/watch?v=o3NJ4uwMl44&t=2s
 * 생활코딩, "JAVA method - 4. 메소드의 입력", https://www.youtube.com/watch?v=1HE1TdRzywE&t=1s
 * 생활코딩, "JAVA method - 5. 메소드의 출력", https://www.youtube.com/watch?v=fhIDPeZ1sEM&t=1s
 */