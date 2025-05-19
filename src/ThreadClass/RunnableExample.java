package ThreadClass;

public class RunnableExample implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "is running. Count:" + i);
            try {
                Thread.sleep(1000); //Simulate some work with sleep
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
