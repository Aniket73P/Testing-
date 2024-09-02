package Assignment_core_java;

public class P17_RunnableInterface {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("Hi");
		System.out.println(t);
		System.out.println();
		for(int i=1;i<=5;i++) {
			System.out.println(t);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				}
			
		}
}
