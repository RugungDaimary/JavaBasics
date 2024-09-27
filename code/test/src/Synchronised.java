class Table {
    synchronized  void display(int n){
        for(int i=1;i<=10;i++){
            System.out.println(i*n);
        }
    }
}

class Thread1 extends Thread{

    Table t;
    public Thread1(Table t){
        this.t=t;
    }
    public void run(){
        t.display(5);
    }

}
class Thread2 extends Thread{

    Table t;
    public Thread2(Table t){
        this.t=t;
    }
    public void run(){
        t.display(7);
    }

}

class Synchronized{
    public static void main(String[] args) {
        Table table=new Table();
        Thread1 th1=new Thread1(table);
        Thread2 th2=new Thread2(table);
        th1.start();
        th2.start();
        
        
    }
    
}