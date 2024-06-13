public class GetNameAndSetNameThread extends Thread {
	 public void run() {
		 System.out.println(Thread.currentThread().getName());
		 System.out.println("Thread Task1");
	 }
	 public void runs() {
		 System.out.println(Thread.currentThread().getName());
		 
	 }
	public static void main(String[] args) {
		
	      GetNameAndSetNameThread t1=new GetNameAndSetNameThread();
	       t1.start();
	       t1.runs();
	       System.out.println(Thread.currentThread().getName());	
}
}

  // Output :- main
  //	main
  //	Thread-0
  //	Thread Task1