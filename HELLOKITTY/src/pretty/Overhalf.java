package pretty;

public class Overhalf {
	public static boolean getHalfnum(char[] myarray){
		int[] n = new int[256];
		for(char item:myarray){
			n[item] += 1;
		}
		for(char item:myarray){
			if(n[item]> myarray.length >> 1){
				System.out.print(item);
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		char[] c = {'a', 'c', '2', 'a', '8', ' ', 'a', 'a', '6', '2', 'a', 'a', 'a', 'a'};
		Overhalf.getHalfnum(c);
	}

}
