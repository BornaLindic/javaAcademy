package globallogic.com.javaAcademy;

import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
    	Map<Character, Integer> m = new TreeMap<>();

    	try {
        	for(int i=0; i<args.length; i++) {
            	for(char c : args[i].toLowerCase().toCharArray()) {
            		if(m.containsKey(c)) {
            			int newValue = m.get(c) + 1;
            			m.put(c, newValue);
            		} else {
            			m.put(c, 1);
            		}
            	}
        	}
        	
        	for(Map.Entry<Character, Integer> entry : m.entrySet()) {
        		System.out.println(entry.getKey() + "=" + entry.getValue());
        	}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
    	
    }
}
