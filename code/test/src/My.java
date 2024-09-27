
class DefaultThread {
    public void start(){
        run();
    }
    public void run(){
        System.out.println("Rugung");
    }
}
class Table{
    public  void  display(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
        
    }
}
class MyThread extends DefaultThread{

    Table t;
    int num; 
    MyThread(Table t, int num){
        this.t=t;
        this.num=num;
    }
    public void run(){
        t.display(this.num);
        
    }
}
public class My {
    public static void main(String[] args) {

        Table t=new Table();
        MyThread th1=new MyThread(t,5);
        MyThread th2=new MyThread(t,6);
        th1.start();
        th2.start();
    }
}