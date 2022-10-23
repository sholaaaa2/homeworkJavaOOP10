package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;

public class Translater {
	private File f;
	private Dictionary dc = new Dictionary();

	public Translater(File f) {
		super();
		this.f = f;
	}

	public Translater() {
		super();
	}

	public void translate() {
		try (BufferedReader bf = new BufferedReader(new FileReader(f));
				PrintWriter pw = new PrintWriter("Ukraine.out.txt")) {
			String str = " ";
			for (; (str = bf.readLine()) != null;) {
				String[] helpStr = str.toLowerCase().split(" ");
				for (String string : helpStr) {
					String tr = dc.getMp().get(string);
					pw.print(tr + " ");
				}
				pw.println();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
