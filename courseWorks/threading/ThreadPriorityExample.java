public class ThreadPriorityExample {

    public static void main(String[] args) {
        // Creating two threads
        Thread highPriorityThread = new Thread(new MessagePrinter("High Priority Thread"));
        Thread lowPriorityThread = new Thread(new MessagePrinter("Low Priority Thread"));

        // Setting thread priorities
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Setting to maximum priority (10)
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // Setting to minimum priority (1)

        // Displaying thread priorities
        System.out.println(highPriorityThread.getName() + " priority: " + highPriorityThread.getPriority());
        System.out.println(lowPriorityThread.getName() + " priority: " + lowPriorityThread.getPriority());

        // Starting threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }

    static class MessagePrinter implements Runnable {
        private final String message;

        public MessagePrinter(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(message + " - Message " + (i + 1));
                try {
                    Thread.sleep(500); // Sleep for 0.5 seconds to simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }
}
