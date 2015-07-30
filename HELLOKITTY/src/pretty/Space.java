package pretty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Space {

	public static void replaceSpace(String s){
		char[] c = s.toCharArray();
		for( int i = 0; i < s.length(); i++)
			if(c[i] == ' ')
				System.out.print("%20");
			else
				System.out.print(c[i]);
		System.out.println();
		}
	public static StringBuilder replaceSpace2(String s){
		StringBuilder sb = new StringBuilder();
		char[] c = s.toCharArray();
		for( int i = 0; i < s.length(); i++)
			if(c[i] == ' ')
				sb.append("%20");
			else
				sb.append(c[i]);
		System.out.print(sb);
		System.out.println();
		return sb;
		}
	public static StringBuffer replaceAll(String sb, String source, String target){
        StringBuffer result = new StringBuffer();
		Pattern p = Pattern.compile(source);
		Matcher m = p.matcher(sb);
		while(m.find()){
			m.appendReplacement(result, target);		
		}
		m.appendTail(result);
		System.out.println(result);
		return result;
		
	}
	public static void main(String[] args) {
		String s = new String("We 1 We 2 We 3 We 4");
		String s1 = new String("  We  1  %20  2");
		Space.replaceSpace("   We are happy.");
		Space.replaceSpace("We    are    happy.");
		Space.replaceSpace2("   We are happy.");
		Space.replaceSpace2("We    are    happy.");
		Space.replaceAll(s, "We", "%20");
		Space.replaceAll(s1, "%20", "We");
	}
}
