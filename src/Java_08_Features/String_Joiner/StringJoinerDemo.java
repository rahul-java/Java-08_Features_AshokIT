package Java_08_Features.String_Joiner;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		
		StringJoiner sj=new StringJoiner("-");
		
		sj.add("Rahul");
		sj.add("Kumar");
		sj.add("Pandey");
		
		System.out.println(sj);  //Rahul-Kumar-Pandey
		
		StringJoiner sj2 = new StringJoiner("-","(",")");
		
		//"-" => delimiter
		//"(" => prefix
		//")" => suffix
		
		sj2.add("Rahul");
		sj2.add("Kumar");
		sj2.add("Pandey");
		
		System.out.println(sj2);  //(Rahul-Kumar-Pandey)
	}
}
