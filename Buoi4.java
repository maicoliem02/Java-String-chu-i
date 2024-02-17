package Buoi04;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * charAt(index)
		 */
//		String a = "Lê Đào Tấn Thành";
//		char myChar = a.charAt(100);
//		System.out.println(myChar);
		
		/*
		 * compareTo(str)
		 */
//		String s1 = "aBc";
//		String s2 = "abc";
//		int result = s1.compareTo(s2);
//		System.out.println(result);
		
		/*
		 * compareToIgnoreCase(str)
		 */
		
//		String s1 = "aBc";
//		String s2 = "abc";
//		int result = s1.compareToIgnoreCase(s2);
//		System.out.println(result);
		
		/*
		 * concat(str)
		 */
//		String s = "abc";
//		String result = s.concat("123");
//		System.out.println(result);
//		System.out.println(s);
		
		/*
		 * contains(str)
		 */
//		String s1 = "le dao tan thanh";
//		String s2 = "dAo";
//		boolean result = s1.contains(s2);
//		System.out.println(result);
		
		/*
		 * endsWith(str), startsWith(str)
		 */
//		String s = " le dao tan thanh";
////		boolean result = s.endsWith("than");
//		boolean result = s.startsWith("le");
//		System.out.println(result);
		
		/*
		 * equals(str)
		 */
//		String s = "abc";
//		boolean result = s.equals("aBc");
//		System.out.println(result);
		
		/*
		 * equalsIgnoreCase(str)
		 */
//		String s = "abc";
//		boolean result = s.equalsIgnoreCase("aBc");
//		System.out.println(result);
		
		/*
		 * getBytes()
		 */
//		String s = "thanh";
//		byte[] myArr = s.getBytes();  // "thanh" => ['t', 'h', 'a', 'n', 'h'] => [...]
//		System.out.println(Arrays.toString(myArr));
//		byte[] myArr = new byte[] {53, 61, 34, 108, 119};
//		String s = new String(myArr);
//		System.out.println(s);
		
		/*
		 * length()
		 */
//		String s = "thanh";
//		System.out.println(s.length());
		
		/*
		 * getChars()
		 */
//		String s = "abcdefg";
//		int startFromStr = 2;
//		int endFromStr = 5;
//		char[] box = new char[10];
//		int startFromBox = 3;
//		s.getChars(startFromStr, endFromStr, box, startFromBox);
//		System.out.println(Arrays.toString(box));
		
		/*
		 * toCharArray()
		 */
//		String s = "thanh";
//		char[] myArr = s.toCharArray();
//		System.out.println(Arrays.toString(myArr));
//		char[] myArr = new char[] {'h', 'e', 'l', 'l', 'o', '!'};
//		String s = new String(myArr);
//		System.out.println(s);
		
		/*
		 * indexOf(str), lastIndexOf(str)
		 */
//		String s = "abcdefdf";
////		int result = s.indexOf("e", 5);
////		int result = s.lastIndexOf("d");
//		System.out.println(result);
		
		/*
		 * isEmpty() [không có ký tự], isBlank() [không có ký tự, và chuỗi có ký tự nhưng toàn là dấu space]
		 */
//		String s = "          ?         ";
//		System.out.println(s.length());
//		System.out.println(s.isEmpty());
//		System.out.println(s.isBlank());
		
		/*
		 * replace(oldStr, newStr)
		 */
//		String s = "le dao tan thanh";
//		String result = s.replace("a", "4");
//		System.out.println(result);
		
		/*
		 * split(str)
		 */
//		String s = "SV001890, Lê Đào Tấn Thành, 29, Quận 7, Năm 5";
//		String[] myArr = s.split(", ");
//		System.out.println(Arrays.toString(myArr));
		
		/*
		 * substring()
		 */
//		String s = "abcdefgh";
//		String result = s.substring(3);
//		System.out.println(result);
		
		/*
		 * toLowerCase(), toUpperCase()
		 */
//		String s = "Le Dao Tan Thanh";
//		System.out.println(s.toLowerCase());
//		System.out.println(s.toUpperCase());
		
		/*
		 * trim()
		 */
//		String s = "    Lê Đào   Tấn Thành    ";
//		String result = s.trim();
//		System.out.println(result);
		
	}

}
