package com.chenbin.thread.study;

public class DemoThread extends Thread {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Thread1 t1 = new Thread1();
      t1.run();
      t1.start();
    }
  }
}


class Thread1 extends Thread {
  @Override
  public void run() {
    // Perform time-consuming operation...
    
    System.out.println("Thread1 run. thread nam is " + this.getName());
  }
}
