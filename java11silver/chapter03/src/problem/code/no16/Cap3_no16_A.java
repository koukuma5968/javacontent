package problem.code.no16;

public class Cap3_no16_A {

    public static void main(String[] args) {
    	int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
    	int i = 0;
    	int sum = 0;
    	while (i < 10) {
    		if (i % 2 == 0) {
    			sum += nums[i];
    		}
            i++;
    	}
        System.out.println(sum);
    }
}
