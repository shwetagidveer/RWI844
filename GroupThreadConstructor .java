public class GroupThreadConstructor extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
    }

    public static void main(String[] args) {
        GroupThreadConstructor thread = new GroupThreadConstructor();
        System.out.println("Thread is Start or Not = " + thread.isAlive());
        thread.run(); 
        System.out.println("After Running the Thread = " + thread.isAlive());
        
        ThreadGroup tg1 = new ThreadGroup("Parent Thread");
        
        Thread tg3 = new Thread(tg1, new GroupThreadConstructor(), "the");
        tg3.start();

        Thread tg4 = new Thread(tg1, new GroupThreadConstructor(), "work");
        tg4.start();

        System.out.println("Thread Group Name: " + tg1.getName());
        tg1.list();
    }
}

  //  Output :- Thread is Start or Not = false
  //	true
  //	After Running the Thread = false
  // 	true
  //	true
  //	Thread Group Name: Parent Thread
  //	java.lang.ThreadGroup[name=Parent Thread,maxpri=10]
