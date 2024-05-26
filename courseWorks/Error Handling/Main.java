class SharedResource {
    private int count = 0;

    // Method to increment the count while ensuring thread safety
    public synchronized void increment() {
        count++;
    }

    // Method to get the current count value
    public int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private SharedResource sharedResource;

    public MyThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sharedResource.increment(); // Increment the count
        }
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();
        MyThread thread1 = new MyThread(sharedResource);
        MyThread thread2 = new MyThread(sharedResource);

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2

        thread1.join(); // Wait for thread 1 to finish
        thread2.join(); // Wait for thread 2 to finish

        // After both threads finish, print the final count
        System.out.println("Final Count: " + sharedResource.getCount());
    }
}
