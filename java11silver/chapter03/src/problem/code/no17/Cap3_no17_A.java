package problem.code.no17;

public class Cap3_no17_A {

    public static void main(String[] args) {
    	for (Cap3_no17_ENUM em : Cap3_no17_ENUM.values()) {
    		if (!em.isB()) {
    			continue;
    		}
        	System.out.println(em.name());
    	}
    }
}
