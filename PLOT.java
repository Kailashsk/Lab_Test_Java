/*Create an abstract class PLOT with abstract method cost calculation().
 Write a program to create two classes derived from PLOT class namely 
 SQUARE PLOT and RECTANGULAR  PLOT with data members length and breadth in feet. 
 Given the cost per square feet for SQUARE PLOT as Rs. 1100 and for RECTANGULAR PLOT as Rs. 900, 
 write a program in java to compute and display the cost for each type of plot */

 import java.util.*;

 abstract class PLOT {
    abstract void cost_calculation(int length,int breadth);

 }

 class SQUARE_PLOT extends PLOT
 {
    int length,breadth;
    void cost_calculation(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("SQUARE PLOT is "+length*breadth*1100);
    }    

 }

 class RECTANGULAR_PLOT
 {
    int length,breadth;
    void cost_calculation(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        System.out.println("RECTANGULAR PLOT is "+length*breadth*900);
    }   

 }

 public class lab2
 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length & breadth");
        int length=sc.nextInt();
        int breadth=sc.nextInt();

        SQUARE_PLOT sq=new SQUARE_PLOT();
        sq.cost_calculation(length,breadth);

        RECTANGULAR_PLOT rec=new RECTANGULAR_PLOT();
        rec.cost_calculation(length,breadth);
    }
 }
