package di_rover;

class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! My name is " + Thread.currentThread().getName());
            }
        } catch (InterruptedException err) {

        } finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }
}
