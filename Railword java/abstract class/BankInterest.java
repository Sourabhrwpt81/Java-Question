interface Loan{
    void Homeloan();
    void Croploan();
    String Businessloan();
}


abstract class Bank implements Loan {
    abstract String rateofinterest();
     public void Homeloan(){
        System.out.println("Rate of interest on home loan is 8%");
     }
     public String Businessloan(){
        return("Rate of interest on Business loan is 7%");
     }
    // abstract public void Croploan();
}

class RBI extends Bank implements Loan {
    String rateofinterest(){
        return("\nWelcome to RBI Bank");
    }
   public void Croploan(){
       System.out.println("Rate of interest on Crop loan is 14%");

    }
   
}
class BOI extends Bank implements Loan{
    String rateofinterest(){
        return("\nWelcome to BOI Bank");
    }
   public void Croploan(){
        System.out.println("Rate of interest on Crop loan is 18%");
 
     }
}
class SBI extends Bank implements Loan{
    String rateofinterest(){
        return("\nWelcome to SBI Bank");
    }
   public void Croploan(){
        System.out.println("Rate of interest on Crop loan is 13%");
 
     }
}
class IDBI extends Bank implements Loan{
    String rateofinterest(){
        return("\nWelcome to IDBI Bank");
    }
   public void Croploan(){
        System.out.println("Rate of interest on Crop loan is 12%");
 
     }
}

class BankInterest{
    public static void main(String[] args){
        RBI r= new RBI();
        // Bank b1=r;
        BOI b=  new BOI();
        SBI s=  new SBI();
        IDBI i=  new IDBI();

      System.out.println( r.rateofinterest());
      r.Homeloan();
      r.Croploan();
      System.out.println(r.Businessloan());

      System.out.println( b.rateofinterest());
      b.Homeloan();
      b.Croploan();
      System.out.println(b.Businessloan());

      System.out.println( s.rateofinterest());
      s.Homeloan();
      s.Croploan();
      System.out.println(s.Businessloan());

      System.out.println( i.rateofinterest());
      i.Homeloan();
      i.Croploan();
      System.out.println(i.Businessloan());
          
    }
}