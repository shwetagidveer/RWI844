public class PriorityThread extends Thread {
	 public void run() {
		 System.out.println("child Thread");
		 System.out.println(Thread.currentThread().getPriority());
	 }
	

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());
		
		PriorityThread p=new PriorityThread();
		p.setPriority(7);
		p.start();
	}
}

  // Output :- 5
  //	    child Thread
  //	    7