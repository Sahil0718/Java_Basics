package ThreadClass;

public class ExtendingThreadClass {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); //Start time
        ClassOne t1 = new ClassOne();
        ClassTwo t2 = new ClassTwo();
        ClassThree t3 = new ClassThree();

        t1.start();
        t2.start();
        t3.start();

        //wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis(); //EndTime
        System.out.printf("\n Total time taken by %s: %d milliseconds\n", Thread.currentThread().getName(),
                (endTime - startTime));
    }
}