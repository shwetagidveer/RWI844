//package com.practise;

class Video{
	void video() {
		         System.out.println("Play Video");
	                       }
}
class Music{
	void music() {
		         System.out.println("Play Music");
	                        }
}


public class MediaPlayer {

	public static void main(String[] args) {
		Video v=new Video();
		v.video();
		Music m1=new Music();
		m1.music();
	}

}

  // Output :- Play Video
  //                   Play Music