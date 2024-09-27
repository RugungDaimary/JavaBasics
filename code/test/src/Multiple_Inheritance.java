//Multiple Inheretance Using Interface
interface Animal{
    public void eat();
}
interface Bird{
    public void fly();
}

class Eagle implements Animal,Bird{
    public void eat(){
        System.out.println("Eagle Eats !");
    }
    public void fly(){
        System.out.println("Eagle fly");
    }
    
}

//Below is for Abstract class
abstract class Person{
    abstract void sleep();
    public void run(){
        System.out.println("Person runs !");
    }
}
class Student extends Person{
    public void sleep(){
        System.out.println("Student is Sleeping!");
    }
}

public class Multiple_Inheritance{
    public static void main(String[] args) {
        Eagle egle=new Eagle();
        egle.eat();
        egle.fly();
        Student s=new Student();
        s.run();
        s.sleep();
        
    }
}
