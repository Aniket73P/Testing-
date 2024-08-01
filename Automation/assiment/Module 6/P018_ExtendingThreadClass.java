package Assignment_core_java;
import javax.swing.plaf.multi.MultiButtonUI;

class Multi extends Thread {
	public void run() {
		System.out.println("Thread is running");
		
	}
	
}

public class P018_ExtendingThreadClass {
	public static void main(String[] args) {
		Multi t1 = new Multi();
		t1.start();
		
	}

}
