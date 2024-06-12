//package com.practise;

class Book implements Runnable {
    @Override
    public void run() {
        System.out.println("Read Book");
    }
}

class Pen implements Runnable {
    @Override
    public void run() {
        System.out.println("Write with Pen");
    }
}

public class LibraryThread {
    public static void main(String[] args) {
       
        Book b1 = new Book();
        Pen p1 = new Pen();

        Thread bt = new Thread(b1);
        Thread pt = new Thread(p1);

        bt.start();
        pt.start();
    }
}

// Output :-  Read Book
//                  Write with Pen
