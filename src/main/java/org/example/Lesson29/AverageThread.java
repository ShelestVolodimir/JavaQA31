package org.example.Lesson29;

class AverageThread extends Thread {
    private final int[] array;
    private double averageResult;

    public AverageThread(int[] array) {
        this.array = array;
    }

    public void run() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        averageResult = (double) sum / array.length;
    }

    public double getAverageResult() {
        return averageResult;
    }
}
