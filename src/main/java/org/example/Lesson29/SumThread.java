package org.example.Lesson29;

class SumThread extends Thread {
        private final int[] array;
        private int sumResult;

        public SumThread(int[] array) {
            this.array = array;
        }

        public void run() {
            for (int value : array) {
                sumResult += value;
            }
        }

        public int getSumResult() {
            return sumResult;
        }
    }

