package Java_08_Features.Method_Reference;

public class InstanceMethodReferenceDemo {

	public void m1()
	{
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
	public static void main(String[] args) {
		
		InstanceMethodReferenceDemo imr = new InstanceMethodReferenceDemo();
		Runnable r=imr::m1;
		//r.run();
		
		Thread t = new Thread(r);
		t.start();
	}
}
