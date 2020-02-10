/*Java program for Calculator.*/
 
import java.util.*;
 
public class Math{
 
     public static void main(String []args){
         int a,b,choice;
         float result=0;
         /*scanner class object to read values*/
         Scanner sc=new Scanner(System.in); 
         while(true)
         {	
        
         System.out.print("Enter first number: ");
         a=sc.nextInt();
         System.out.print("Enter second number: ");
         b=sc.nextInt();
          
         System.out.print("\n1: Addition.\n2: Subtraction.");
         System.out.print("\n3: Multiplication.\n4: Divide.");
         System.out.print("\n5: Remainder.\n6: Exit.");
          
         System.out.print("\nEnter your choice: ");
         choice=sc.nextInt();
          
         switch(choice)
         {
             case 1://addition
                 result=(a+b); break;
             case 2://subtraction
                 result=(a-b); break;
             case 3://multiplication
                 result=(a*b); break;
             case 4://division
                 result=(float)((float)a/(float)b); break;
             case 5://remainder
                 result=(a%b); break;
             case 6://exit
            	 break;
             default:
                 System.out.println("An Invalid Choice!!!\n");
         }
         if(choice>=1 && choice<=5)
            System.out.println("Result is: " + result);      
         if(choice==6)
        	 break;
         }
        
      
          
     }
}
