package CybageAssignment;

public class NestedLoop {
    public static void main(String args[]) {
      int i=0;
      int j=0;
      int n=1;
     
     for (i=0;i<5;i++)
     {
         for(j=0;j<=i;j++)
         {
             System.out.print(n);
             n++;
         }
        System.out.println(); 
        n=1;
     }
    }
}
