package pretty;

public class Onlychar {
	public static char getChar(String s){
		char[] c = s.toCharArray();
		int[] n = new int[256];
		for(char item:c) n[item - 'a'] += 1;
		for(char item:c)
			if(n[item - 'a'] == 1){
				System.out.println(item);
				return item;
			}
		System.out.print(Character.UNASSIGNED);
		return Character.UNASSIGNED;
	}

	public static void main(String[] args) {
		Onlychar.getChar("abddabc");
		Onlychar.getChar("abddabcc");
//		System.out.println(Character.UNASSIGNED);
	}

}
