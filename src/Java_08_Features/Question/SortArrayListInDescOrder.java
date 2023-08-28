package Java_08_Features.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Approach-1 without LAMBDA
public class SortArrayListInDescOrder {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList();
		arrayList.add(1);
		arrayList.add(12);
		arrayList.add(101);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(10);
		arrayList.add(15);
		
		System.out.println("Before Sort ::: "+arrayList);
		
		Collections.sort(arrayList, new NumberComperator());
		
		System.out.println("After Sort ::: "+arrayList);
	}
}

class NumberComperator implements Comparator<Integer>
{

	@Override
	public int compare(Integer i, Integer j) {
		if(i>j)
			return -1;
		else if(i<j)
			return 1;
		else
		    return 0;
	}
	
}
