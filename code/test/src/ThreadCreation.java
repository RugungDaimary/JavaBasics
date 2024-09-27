
//Thread Creation
class MyThread extends Thread{
    
    // public void start(){ //Internal
    //     .....
    //     .....
    //     .....
    //     run();
    // }
     
    public void run(){//override
       for(int i=0;i<=10;i++){
            System.out.println(i+Thread.currentThread().getName());
       }
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        MyThread th1=new MyThread();
        MyThread th2=new MyThread();
        th1.start();
        th2.start();
        for(int i=0;i<=1000;i++){
            System.out.println("Rugung");
        }
        
    }
}


// class MyThread implements Runnable{
//     public void run(){
//        System.out.println("Thread Created using Interface: " + Thread.currentThread().getName());
//     }

// }
// public class  ThreadCreation{
//     public static void main(String[] args){
//         MyThread th=new MyThread();
//         Thread t1=new Thread(th);
//         Thread t2=new Thread(th);
//         t1.start();
//         t2.start();

//     }
// }