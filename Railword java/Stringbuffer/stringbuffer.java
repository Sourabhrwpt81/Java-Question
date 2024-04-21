class stringbuffer{
    public static void main(String[] args){

      //1. append() Method
        StringBuffer s1= new StringBuffer("Hello");
           s1.append(" good morning");
           System.out.println(s1);//Hello good morning



      //2. insert() Method
      StringBuffer s2= new StringBuffer("Sourabh");
         s2.insert(1,"rwpt");
         System.out.println(s2);//Srwptourabh



      //3. equals()  Method
        String s3="hello";
        StringBuffer s4= new StringBuffer("hello");
        StringBuffer s5= new StringBuffer("hello");
        System.out.println(s3.equals(s4));//false
        System.out.println(s5.equals(s4));//false
        System.out.println(s5==s4);//false
        // System.out.println(s3==s4);//error: incomparable types: String and StringBuffer



      //4. replace() Method
      StringBuffer s6= new StringBuffer("hello");
       s6.replace(1,3,"java");
       System.out.println(s6);//hjavalo



      //5. delete() Method
      StringBuffer s7= new StringBuffer("souhellorabh");
      s7.delete(3,8);
      System.out.println(s7);//sourabh



      //6. reverse() Method
      StringBuffer s8= new StringBuffer("railworld");
      s8.reverse();
      System.out.println(s8);//dlrowliar


      //7. capacity() Method
      StringBuffer s9= new StringBuffer();
      System.out.println(s9.capacity());//16
      s9.append("i am software devloper");
      System.out.println(s9.length());//22
      System.out.println(s9.capacity());//34 formula{ oldcapacity*2 + (2) }
      s9.append("at railworld private limited indore");
      System.out.println(s9.capacity());//70  formula{ 34*2 + (2) = 70}
     

      //8. ensureCapacity() method
      StringBuffer s10= new StringBuffer();
      System.out.println(s10.capacity());//16
      s10.append("i am software devloper");
      System.out.println(s10.capacity());//34
      s10.ensureCapacity(15);
      System.out.println(s10.capacity());//34
      s10.ensureCapacity(35);//when ensure capacity is overload the capacity automatic increased.
      System.out.println(s10.capacity());//70



    }
}