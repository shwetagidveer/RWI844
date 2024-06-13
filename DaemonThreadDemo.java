public class DaemonThreadDemo extends Thread {
	public void run() {
		System.out.println("This is Child Thread");
	}
	
	public static void main(String[] args) {
		System.out.println("Parent Thread");
		DaemonThreadDemo d=new DaemonThreadDemo()
;
//		d.setDaemon(false);
		d.start();
	}
}

  // Output :- Parent Thread
  //	    This is Child Thread