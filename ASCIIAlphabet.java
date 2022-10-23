package homework;

import java.util.HashMap;

public class ASCIIAlphabet {
	private HashMap<Character, String[]> hm = new HashMap<Character, String[]>();

	public ASCIIAlphabet() {
		super();
		realizeAlphabet();
	}

	private void realizeAlphabet() {
		String[] a = new String[] { "     *     ", "    * *    ", "   *   *   ", "  *******  ", " *       * ",
				"*         * " };
		String[] b = new String[] { "********** ", "*        * ", "*        * ", "********** ", "*        * ",
				"***********" };
		String[] c = new String[] { "***********", "*          ", "*          ", "*          ", "*          ",
				"***********" };
		String[] d = new String[] { "********** ", "*        * ", "*         *", "*         *", "*        * ",
				"********** " };
		String[] e = new String[] { "***********", "*          ", "*          ", "***********", "*          ",
				"***********" };
		String[] f = new String[] { "***********", "*          ", "*          ", "***********", "*          ",
				"*          " };
		String[] g = new String[] { "***********", "*          ", "*          ", "*       ***", "*         *",
				"***********" };
		String[] h = new String[] { "*         *", "*         *", "***********", "*         *", "*         *",
				"*         *" };
		String[] i = new String[] { "    ***    ", "     *     ", "     *     ", "     *     ", "     *     ",
				"    ***    " };
		String[] j = new String[] { "***********", "     *     ", "     *     ", "     *     ", "    *      ",
				"****       " };
		String[] k = new String[] { "*        **", "*       *  ", "*     *    ", "** * *     ", "*      *   ",
				"*       ***" };
		String[] l = new String[] { "*          ", "*          ", "*          ", "*          ", "*          ",
				"*********  " };
		String[] m = new String[] { "*         *", "*         *", "* *     * *", "*  *   *  *", "*    *    *",
				"*         *" };
		String[] n = new String[] { "*         *", "**        *", "* *       *", "*   *     *", "*     *   *",
				"*      ****" };
		String[] o = new String[] { "***********", "*         *", "*         *", "*         *", "*         *",
				"***********" };
		String[] p = new String[] { "***********", "*         *", "*         *", "***********", "*          ",
				"*          " };
		String[] q = new String[] { "***********", "*         *", "*         *", "*     *   *", "***********",
				"        *  " };
		String[] r = new String[] { "********** ", "*         *", "*         *", "********** ", "      **   ",
				"        ***" };
		String[] s = new String[] { "       *** ", "*          ", "**         ", "  *****    ", "       *   ",
				"*******    " };
		String[] t = new String[] { "***********", "     *     ", "     *     ", "     *     ", "     *     ",
				"     *     " };
		String[] u = new String[] { "*         *", "*         *", "*         *", "*         *", "*         *",
				"***********" };
		String[] v = new String[] { "*         *", " *       * ", "  *     *  ", "   *   *   ", "    * *    ",
				"     *     " };
		String[] w = new String[] { "*         *", "*         *", "*         *", "**   *    *", "  * *  * * ",
				"   **  **  " };
		String[] x = new String[] { "*         *", " *       * ", "  *******  ", "  *     *  ", " *       * ",
				"*         *" };
		String[] y = new String[] { "*         *", " *        *", "  *      * ", "    *****  ", "        *  ",
				"********   " };
		String[] z = new String[] { "***********", "          *", "         * ", " ********  ", "*          ",
				"***********" };

		hm.put('a', a);
		hm.put('b', b);
		hm.put('c', c);
		hm.put('d', d);
		hm.put('e', e);
		hm.put('f', f);
		hm.put('g', g);
		hm.put('h', h);
		hm.put('i', i);
		hm.put('j', j);
		hm.put('k', k);
		hm.put('l', l);
		hm.put('m', m);
		hm.put('n', n);
		hm.put('o', o);
		hm.put('p', p);
		hm.put('q', q);
		hm.put('r', r);
		hm.put('s', s);
		hm.put('t', t);
		hm.put('u', u);
		hm.put('v', v);
		hm.put('w', w);
		hm.put('x', x);
		hm.put('y', y);
		hm.put('z', z);
	}

	public HashMap<Character, String[]> getHm() {
		return hm;
	}

	public void setHm(HashMap<Character, String[]> hm) {
		this.hm = hm;
	}
	
	
}
