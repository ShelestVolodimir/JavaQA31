package org.example.Lesson31;

class CounterRunnable implements Runnable {
    private int counter = 0;

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }
}




