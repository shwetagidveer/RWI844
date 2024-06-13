public class ThreadGroupDemo implements Runnable {    
  
    public void run() {    
        System.out.println(Thread.currentThread().getName());    
    }    
    
    public static void main(String[] args) {    
       
        ThreadGroupDemo runnable = new ThreadGroupDemo();            
       
        ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");            
       
        Thread t1 = new Thread(tg1, runnable, "One");    
        Thread t2 = new Thread(tg1, runnable, "Two");    
        Thread t3 = new Thread(tg1, runnable, "Three");          
       
        t1.start();    
        t2.start();    
        t3.start();    
        
         System.out.println("Thread Group Name: " + tg1.getName());          
       
        tg1.list();    
    }    
}

  // Output :- One
  //	Two
  //	Three
  // 	Thread Group Name: Parent ThreadGroup
  //	java.lang.ThreadGroup[name=Parent ThreadGroup,maxpri=10]
