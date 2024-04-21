class Bank{
    double amount;
    public void setamount(double amount){
        this.amount= amount;
    }

     public double getbalance(){
        return amount;
     }
}

class BOI extends Bank{ 
    public void setamount(double amount){  
   if(amount>=50000 && amount <= 99999){
    System.out.println("3% tax deducted on 50k balance");
        this.amount= amount-amount*3/100;
    }if(amount >= 100000){
        System.out.println("6% tax deducted on 50k balance");
        this.amount= amount-amount*6/100;
   }
}
    public double getbalance(){
        return amount;
     }

}

class Abstraction{
    public static void main(String[] args){
        BOI b= new BOI();
        //  b.setamount(50000);
         b.setamount(100000);
        System.out.println(b.getbalance());
    }
}