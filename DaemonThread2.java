class DaemonThread2 extends Thread {  
    public void run() {  
        System.out.println("Name: " + Thread.currentThread().getName());  
        System.out.println("Daemon: " + Thread.currentThread().isDaemon());  
    }  
  
    public static void main(String[] args) {  
        DaemonThread2 t1 = new DaemonThread2();  
        DaemonThread2 t2 = new DaemonThread2();  
        t1.setDaemon(true);   // Set daemon before starting the thread  
        t1.start();  
        t2.start();  
    }  
}

  // Output :- Name: Thread-0
  //	    Name: Thread-1
  // 	    Daemon: true
  //	    Daemon: false