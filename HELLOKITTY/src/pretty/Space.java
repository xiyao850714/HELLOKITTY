package pretty;

public class Space {

	public static void replaceSpace(String s){
		char[] c = s.toCharArray();
		for( int i = 0; i < s.length(); i++)
			if(c[i] == ' ')
				System.out.print("%20");
			else
				System.out.print(c[i]);
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
		return sb;
		}
	public static void main(String[] args) {
		Space.replaceSpace("   We are happy.");
		Space.replaceSpace("We    are    happy.");
		Space.replaceSpace2("   We are happy.");
		Space.replaceSpace2("We    are    happy.");
	}
}
