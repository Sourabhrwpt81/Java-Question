class person{  //parentclass
    String pname="sourabh";
    String paddress= "Indore";
    long paadhar= 452625498928l;
    void eat(){
        System.out.println("eating");
    }
    void walk(){
        System.out.println("walking");
    }
}

class Student extends person{     //childclass //inheritance
      int Srollno= 101;
      String Schoolname="DPS";
      void learn(){
        System.out.println("learing");
      }
      void write(){
        System.out.println("writing");
      }
}

class Inheritance{
    public static void main(String[] args){  //main class
        Student s1= new Student();
        System.out.println(s1.pname);
        System.out.println(s1.paddress);
        System.out.println(s1.paadhar);
        System.out.println(s1.Srollno);
        System.out.println(s1.Schoolname);
        s1.eat();
        s1.walk(); //child class object call parent class method
        s1.learn();
        s1.write();
    }
}