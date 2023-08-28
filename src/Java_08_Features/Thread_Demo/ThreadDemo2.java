package Java_08_Features.Thread_Demo;

//Approach-2
public class ThreadDemo2 {

	
public static void main(String[] args) {
		
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {

			for(int i=1;i<=5;i++)
			{
				System.out.println("===>> "+i);
			}
		}
	};
	
	Thread thread = new Thread(runnable);
	thread.start();
	}
}
