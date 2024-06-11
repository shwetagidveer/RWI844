class Multi1 implements Runnable{  
public void run(){  
System.out.println("Thread is running...");  
}  
  
public static void main(String args[]){  
Multi1 m1=new Multi1 ();  
Thread t1 =new Thread(m1);   // Using the constructor Thread(Runnable r)  
t1.start();  
 }  
}

  // Output :- Thread is running... 