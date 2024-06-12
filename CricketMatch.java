
class Player implements Runnable {
    private String playerName;
   
    public Player(String playerName) {
        this.playerName = playerName;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(playerName + " Scores Run " + i);
            try {
                
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(playerName + " is done batting.");
    }
}

public class CricketMatch {
    public static void main(String[] args) {
       
        Player p1 = new Player("Rohit");
        Player p2 = new Player("Virat");
        
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        // Start the threads
        t1.start();
        t2.start();

        try {
          
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Match Over.");
    }
}


 // Output :- Virat Scores Run 1
  //	Rohit Scores Run 1
  //	Virat Scores Run 2
  //	Rohit Scores Run 2
  //	Virat Scores Run 3
  //	Rohit Scores Run 3
  //	Rohit Scores Run 4
  //	Virat Scores Run 4
  //	Virat Scores Run 5
  //	Rohit Scores Run 5
  //	Rohit is done batting.
  //	Virat is done batting.
  //	Match Over.