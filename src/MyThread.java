public class MyThread extends Thread{
    private String threadName;
    public MyThread(String threadName){
        this.threadName=threadName;
    }
    @Override
    public void run (){
        System.out.println("Running Thread : " +threadName );
        for(int i=0 ; i<9 ;i++){
            System.out.println("thread : "+ threadName+ " Iterations " + i);

        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName+" Stopping");
    }
}
