class Addition{
  int c;
  int d;
    public void add(int a,int b){
         this.c= a+b;
         System.out.println(c);
    }
    public void add(int a,int b, int c){  //overloading
        d= a+b+c;
        System.out.println(d);
    }
}
class subtract extends Addition{
     public int sub(int p , int q){
         return p-q;
     }
     public void add(int a,int b){//overriding
        this.c= a+b;
        System.out.println(c);
   }
}

class Polimorphism{
    public static void main(String[] args){
        subtract s1= new subtract();
         s1.add(5,6);
         s1.add(5,6,4);
      System.out.println(s1.sub(10,5));
    }
}