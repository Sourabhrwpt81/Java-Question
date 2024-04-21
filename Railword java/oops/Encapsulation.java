class User{
    private int uid;
    private  String uname;
    private  String uaddress;
    private long unumber;
     
   public void setUid(int uid){
        this.uid= uid;
    }
   public void setuname(String name){
        this.uname= name;
    }
  public  void setuaddress(String address){
        this.uaddress= address;
    }
   public void setunumber(long number){
        this.unumber= number;
    }

    public int getUid(){
        return uid;
    }
    public String getUname(){
        return uname;
    }
    public String getUaddress(){
        return uaddress;
    }
    public long getUnumber(){
        return unumber;
    }


}

class Encapsulation{
    public static void main(String[] args){
         User s1= new User();
         User s2= new User();

         s1.setUid(101);
         s1.setuname("Sourabh");
         s1.setuaddress("Sanawad");
         s1.setunumber(8103993440l);

         s2.setUid(102);
         s2.setuname("Shivam");
         s2.setuaddress("Barwaha");
         s2.setunumber(9926176682l);

         System.out.println(s1.getUid());
         System.out.println(s1.getUname());
         System.out.println(s1.getUaddress());
         System.out.println(s1.getUnumber());

         System.out.println("\n");
         System.out.println(s2.getUid());
         System.out.println(s2.getUname());
         System.out.println(s2.getUaddress());
         System.out.println(s2.getUnumber());
        
    }
}