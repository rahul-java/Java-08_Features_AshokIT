package Java_08_Features.Functional_Interface.Supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		//String symbols="QWERTYUIOPLKJHGFDSAZXCVBNM";
		
		 
		Supplier<String> s=()->{
			String otp="";
			for(int i=1;i<=5;i++)
			{
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());
		System.err.println(Math.random());
		System.err.println(Math.random()*10);
	}
}
