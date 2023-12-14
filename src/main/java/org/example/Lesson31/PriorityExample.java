package org.example.Lesson31;

public class PriorityExample {
    public static void main(String[] args) {

    CounterRunnable counterRunnable1 = new CounterRunnable();
    Thread thread1 = new Thread(counterRunnable1);
    thread1.setPriority(Thread.MIN_PRIORITY);

    CounterRunnable counterRunnable2 = new CounterRunnable();
    Thread thread2 = new Thread(counterRunnable2);
    thread2.setPriority(Thread.NORM_PRIORITY);

    CounterRunnable counterRunnable3 = new CounterRunnable();
    Thread thread3 = new Thread(counterRunnable3);
    thread3.setPriority(Thread.NORM_PRIORITY);

    CounterRunnable counterRunnable4 = new CounterRunnable();
    Thread thread4 = new Thread(counterRunnable4);
    thread4.setPriority(Thread.MAX_PRIORITY);

    CounterRunnable counterRunnable5 = new CounterRunnable();
    Thread thread5 = new Thread(counterRunnable5);
    thread5.setPriority(Thread.MAX_PRIORITY);

    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    thread1.interrupt();
    thread2.interrupt();
    thread3.interrupt();
    thread4.interrupt();
    thread5.interrupt();

    System.out.println("Counter 1: " + counterRunnable1.getCounter());
    System.out.println("Counter 2: " + counterRunnable2.getCounter());
    System.out.println("Counter 3: " + counterRunnable3.getCounter());
    System.out.println("Counter 4: " + counterRunnable4.getCounter());
    System.out.println("Counter 5: " + counterRunnable5.getCounter());
}
}

