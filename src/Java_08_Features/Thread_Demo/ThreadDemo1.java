package Java_08_Features.Thread_Demo;

//Approach-1
public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
	
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
	
public static void main(String[] args) {
		
		ThreadDemo1 td1 = new ThreadDemo1();
		
		Thread thread = new Thread(td1);
		thread.start();
	}
}
