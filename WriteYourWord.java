package homework;

import java.util.HashMap;

public class WriteYourWord {

	public static void write(String str) {
		str = str.toLowerCase();
		ASCIIAlphabet as = new ASCIIAlphabet();
		char[] youChar = str.toCharArray();
		HashMap<Character, String[]> hm = as.getHm();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < youChar.length; j++) {
				String[] bokova = hm.get(youChar[j]);
				System.out.print(bokova[i]+" ");
			}
			System.out.println();
		}
	}

}
