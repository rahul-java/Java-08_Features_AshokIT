package Java_08_Features.Thread_Demo;

//Approach-3
public class ThreadDemo3 {

	
public static void main(String[] args) {
		
	Runnable runnable = ()-> {
			for(int i=1;i<=5;i++)
			{
				System.out.println("<<===>> "+i);
			}
	};
	
	Thread thread = new Thread(runnable);
	thread.start();
	}
}
