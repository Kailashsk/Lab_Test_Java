/*
Write a program in java to create an abstract class LOAN having data members customer name, principal amount, annual_rate_of_interest,
time and abstract methods getData(), showData().Create theclasses PERSONAL LOAN, HOUSING LOAN and CAR LOANderived from LOAN class, 
having respective rate of interest (Personal loan @14.5%, Housing loan @8.7% and Car loan @9.2%). Create objects of each type of loan 
class and display the details including the total amount of respective interest to be paid. (Note: Interest principal * rate*time / 100).

*/


abstract class LOAN1{
    String name;
    double principle_amt,rate;

    abstract void getData(String name, double p, double rate, double time);
    abstract void showData();

}

abstract class PersonaLoan extends LOAN1
{
    String name;
    double p,rate,time;
    
    @Override
    void getData(String name, double p, double rate, double time) {
        // TODO Auto-generated method stub
        this.name=name;
        this.p=p;
        this.rate=rate;
        this.time=time;
    }

    void showData() {
        double x=(p*rate*time)/100;
       System.out.println(x);  
      }
}

abstract class HousingLoan extends LOAN1
{
    String name;
    double p,rate,time;
    
    @Override
    void getData(String name, double p, double rate, double time) {
        // TODO Auto-generated method stub
        this.name=name;
        this.p=p;
        this.rate=rate;
        this.time=time;
    }

    void showData() {
       double x=(p*rate*time)/100;
       System.out.println(x);  
      }
}

abstract class CarLoan extends LOAN1
{
    String name;
    double p,rate,time;
    
    @Override
    void  getData(String name, double p, double rate, double time) {
        // TODO Auto-generated method stub
        this.name=name;
        this.p=p;
        this.rate=rate;
        this.time=time;
    }

    void showData() {
       double x=(p*rate*time)/100;
       System.out.println(x);  
      }
}


public class Loan
{
    public static void main(String[] args) {
       PersonaLoan p=new PersonaLoan()
       {};
       System.out.println("Personal Loan");
       p.getData("Kailash", 2000, 14.5, 2);
       p.showData();

       HousingLoan h=new HousingLoan() {
        
       };
       System.out.println("Housing Loan");
       h.getData("Sourav", 2600, 8.7, 3);
       h.showData();

       CarLoan c=new CarLoan() {
        
       };
       System.out.println("Car Loan");
       c.getData("Ks", 2800, 9.2, 1);
       p.showData();
    }
}


//Ks
