class Student {
   String name;
   int age;
  
   public void getInfo() {
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
   }
}

class Pen extends Student{
   String color;
  
   public void printColor() {
       System.out.println("The color of this Pen is " + this.color);
   }
}


public class OOP {
   public static void main(String args[]) {
       Student s1 = new Student();
       s1.name = "Aman";
       s1.age = 24;
       s1.getInfo();

       Student s2 = new Student();
       s2.name = "Shradha";
       s2.age = 22;
       s2.getInfo();


       Pen p1 = new Pen();
       p1.color = "Blue";


       Pen p2 = new Pen();
       p2.color = "black";


       Pen p3 = new Pen();
       p3.color = "Red";


       p1.printColor();
       p2.printColor();
       p3.printColor();
       Student P=new Pen();
       System.out.println(P.name);


       
   }
}
