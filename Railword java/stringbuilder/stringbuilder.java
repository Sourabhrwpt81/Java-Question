class stringbuilder{
    public static void main(String[] args){

      //1. append() Method
        StringBuilder s1= new StringBuilder("Hello");
           s1.append(" good morning");
           System.out.println(s1);//Hello good morning



      //2. insert() Method
      StringBuilder s2= new StringBuilder("Sourabh");
         s2.insert(1,"rwpt");
         System.out.println(s2);//Srwptourabh



      //3. equals()  Method
        String s3="hello";
        StringBuilder s4= new StringBuilder("hello");
        StringBuilder s5= new StringBuilder("hello");
        System.out.println(s3.equals(s4));//false
        System.out.println(s5.equals(s4));//false
        System.out.println(s5==s4);//false
        // System.out.println(s3==s4);//error: incomparable types: String and StringBuilder



      //4. replace() Method
      StringBuilder s6= new StringBuilder("hello");
       s6.replace(1,3,"java");
       System.out.println(s6);//hjavalo



      //5. delete() Method
      StringBuilder s7= new StringBuilder("souhellorabh");
      s7.delete(3,8);
      System.out.println(s7);//sourabh



      //6. reverse() Method
      StringBuilder s8= new StringBuilder("railworld");
      s8.reverse();
      System.out.println(s8);//dlrowliar


      //7. capacity() Method
      StringBuilder s9= new StringBuilder();
      System.out.println(s9.capacity());//16
      s9.append("i am software devloper");
      System.out.println(s9.length());//22
      System.out.println(s9.capacity());//34 formula{ oldcapacity*2 + (2) }
      s9.append("at railworld private limited indore");
      System.out.println(s9.capacity());//70  formula{ 34*2 + (2) = 70}
     

      //8. ensureCapacity() method
      StringBuilder s10= new StringBuilder();
      System.out.println(s10.capacity());//16
      s10.append("i am software devloper");
      System.out.println(s10.capacity());//34
      s10.ensureCapacity(15);
      System.out.println(s10.capacity());//34
      s10.ensureCapacity(35);//when ensure capacity is overload the capacity automatic increased.
      System.out.println(s10.capacity());//70



    }
}