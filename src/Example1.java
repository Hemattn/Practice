public class Example1 {
    public static void main(String[] args) {
        MyThread thread1= new MyThread("Thread1");
        MyThread thread2= new MyThread("thread2");
        MyThread thread3= new MyThread("Thread3");
        MyThread thread4= new MyThread("Thread4");

        thread1.start();

        thread2.start();
        System.out.println("Main thread executed");
    }
}
