package Dictionary_Chapter21.java;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	public static void refer(String[] word) {
		HashMap<String,String>dictionary = new HashMap<String,String>();
		
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("pear", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
		String result = "";
		
		for (int i = 0; i < word.length; i++) {
			 result = dictionary.get(word[i]);
			 if(result == null) {
				 result = word[i] + "は辞書に存在していません";
			 }else {
				 result = word[i] + "の意味は" + result;
			 }
			
				
			System.out.println(result);
			
			
		}
		
		
		
	}

}
