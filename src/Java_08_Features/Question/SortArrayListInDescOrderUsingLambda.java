package Java_08_Features.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Approach-2 using LAMBDA
public class SortArrayListInDescOrderUsingLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList=new ArrayList();
		arrayList.add(1);
		arrayList.add(12);
		arrayList.add(101);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(7);
		arrayList.add(10);
		arrayList.add(15);
		arrayList.add(3);
		
		System.out.println("Before Sort ::: "+arrayList);
		
		//Collections.sort(arrayList, new NumberComperator());
		
		//Collections.sort(arrayList,(i,j)->i.compareTo(j) );  //sort in Ascending
		
		Collections.sort(arrayList,(i,j)->(i>j)?-1:1 );  //sort in desc here we are using if else if else
		
		
		System.out.println("After Sort ::: "+arrayList);
	}
}


	

