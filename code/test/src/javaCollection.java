import java.util.ArrayList; 
import java.util.Collections;
import java.util.Vector;
public class javaCollection {
    public static void main(String[] args) {
       ArrayList<Integer>A=new ArrayList<Integer>();
       A.add(1);
       A.add(8);
       A.add(9);
       A.add(3);
       for(int i=0;i<A.size();i++){
        System.out.print(A.get(i)+" ");
       }
       System.out.println();
       A.set(0, 5);
       A.remove(2);
       for(Integer i:A){
        System.out.print(i+" ");
       }
       System.out.println();
       Collections.sort(A);
       for(Integer it:A){
        System.out.print(it+" ");
       }
       A.add(5, 0);
       Vector<Integer> V = new Vector<Integer>(A);
       
    
        
    }
}
