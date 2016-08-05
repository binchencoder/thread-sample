package com.chenbin.thread.study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {

  public static void main(String[] args) {
    ExecutorService pool = Executors.newCachedThreadPool();

  }
}
