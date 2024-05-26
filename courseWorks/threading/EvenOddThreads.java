public class EvenOddThreads {

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenNumberPrinter());
        Thread oddThread = new Thread(new OddNumberPrinter());

        evenThread.start();
        oddThread.start();
    }

    static class EvenNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 11; i <= 30; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even: " + i);
                }
            }
        }
    }

    static class OddNumberPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 11; i <= 30; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd: " + i);
                }
            }
        }
    }
}
