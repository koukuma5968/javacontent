package problem.code.no19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cap3_no19_A {

    public static void main(String[] args) {
    	List<String> animal = new ArrayList<String>();
    	animal.addAll(Arrays.asList("poodle", "pug", "shiba"));
    	Iterator<String> it =  animal.iterator();
    	A :
    	while (it.hasNext()) {
    		String dog = it.next();
        	switch (dog) {
	        	case "poodle" :
	                System.out.print(dog);
	        	case "pug" :
	                System.out.print(dog);
	        		break A;
	        	case "shiba" :
	                System.out.print(dog);
	                break;
        	}
            System.out.print(" ");
    	}
    }
}
