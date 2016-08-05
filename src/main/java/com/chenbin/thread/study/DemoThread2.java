package com.chenbin.thread.study;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class DemoThread2 extends Thread {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Callable<String> callable = new Callable<String>() {
      @Override
      public String call() throws Exception {
        return "chenbin thread study.";
      }
    };
    
    FutureTask<String> task = new FutureTask<>(callable);
    
    Thread t = new Thread(task);
    t.start();
    System.out.println(task.get());
//    task.cancel(true);
  }
}
