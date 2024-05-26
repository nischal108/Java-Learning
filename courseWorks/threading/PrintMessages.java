public class PrintMessages {

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
                try {
                    Thread.sleep(1000); // Sleep for 1 second to avoid overwhelming the console
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
}
