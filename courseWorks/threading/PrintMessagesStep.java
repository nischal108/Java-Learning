public class PrintMessagesStep {

    public static void main(String[] args) {
        Thread goodMorningThread = new Thread(new GoodMorningPrinter());
        Thread welcomeThread = new Thread(new WelcomePrinter());

        goodMorningThread.start();
        welcomeThread.start();
    }

    static class GoodMorningPrinter implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Good morning");
                try {
                    Thread.sleep(1000); // Sleep for 1 second to avoid overwhelming the console
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    static class WelcomePrinter implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Welcome");
                step(); // Call the step method to introduce delay
                try {
                    Thread.sleep(1000); // Sleep for 1 second to avoid overwhelming the console
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }

        private void step() {
            try {
                Thread.sleep(200); // Delay for 200 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
