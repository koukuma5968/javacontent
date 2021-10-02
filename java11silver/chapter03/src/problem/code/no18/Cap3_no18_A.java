package problem.code.no18;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Cap3_no18_A {

    public static void main(String[] args) {
    	Map<String, List<String>> animal = new HashMap<String, List<String>>();
    	animal.put("dog", Arrays.asList("poodle", "pug", "shiba"));
    	animal.put("cat", Arrays.asList("siam", "ragdoll", "persia"));
    	animal.put("hamster", Arrays.asList("syrian", "jenggalian", "roborovski"));
    	Iterator<Entry<String, List<String>>> entry =  animal.entrySet().iterator();
    	while (entry.hasNext()) {
    		Entry<String, List<String>> list = entry.next();
            System.out.print(list.getKey());
            System.out.print(" : ");
    		for (String ani : list.getValue()) {
                System.out.print(ani);
                System.out.print(" ");
    		}
            System.out.println();
    	}
    }
}
