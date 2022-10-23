package homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Dictionary implements Serializable {
	Map<String, String> mp = new HashMap<>();

	public Dictionary(Map<String, String> mp) {
		super();
		this.mp = mp;
	}

	public Dictionary() {
		super();
		startToDictionary();
	}
	
	
	public Map<String, String> getMp() {
		return mp;
	}

	public void setMp(Map<String, String> mp) {
		this.mp = mp;
	}

	private void startToDictionary() {
		mp.put("i", "Я");
		mp.put("walk", "йти");
		mp.put("empty", "пустий");
		mp.put("street", "вулиця");
		mp.put("on", "на");
		mp.put("boulevard", "бульвар");
		mp.put("broken", "розбитий");
		mp.put("dreams", "мрія");
		mp.put("where", "де");
		mp.put("city", "місто");
		mp.put("sleeps", "спить");
		mp.put("and", "і");
		mp.put("only", "тільки");
		mp.put("one", "один");
		mp.put("alone", "самотній");
	}
	
	public void addNewWord(String k, String v) {
		mp.put(k, v);
	}
	public void saveDictionary(File f) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			oos.writeObject(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
