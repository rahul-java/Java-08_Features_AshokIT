package Java_08_Features.Stream_Reduce;

import java.util.Arrays;

public class Stream_Reduce {
	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4,5,6,7,8,9,10};
		
		int reduce = Arrays.stream(nums).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
	}

}
