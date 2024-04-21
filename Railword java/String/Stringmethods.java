class Stringmethods{

    public static void main(String[] args){
        char[] ch= {'h','e','l','l','o'};
        String s="hello";
        String s1="hello";
        // System.out.println(ch==s);  //error: incomparable types: char[] and String
        System.out.println(s==s1);//true
         String s3= new String(ch);//converting char array to string
         System.out.println(s3==s);//false

         //1. charAT()method
         System.out.println(s.charAt(2));//l


         //2. length()method
         System.out.println(s.length());//5


         //3. format()method
         System.out.println(s.format("string is %s",s));


         //4. substring()method
         System.out.println(s.substring(1));//return ello
         System.out.println(s.substring(0,3));//hel


         //5. contains() method
         System.out.println(s.contains("hii"));//false
         String s4="i am a software devloper";
         System.out.println(s4.contains("am"));//true


         //6. join() method
         System.out.println(s4.join("-","21","04","2024"));//21-04-2024


         //7. equals() method
          String s5= "java";
          String s6= "JAVA";
          String s7= "java";
          System.out.println(s5.equals(s6));//false bcz s6 case is different
          System.out.println(s5.equals(s7));//true

          
          //8. isEmpty() method
           String s8="";
           System.out.println(s8.isEmpty()); //true bcz s8 is 0 length
           System.out.println(s7.isEmpty()); //false


          //9. concat() Method 
          String s9="railword";
          String s10="india";
          String s11="pvt ltd.";
           String s12= s9.concat(" ").concat(s10).concat(" ").concat(s11);
           System.out.println(s12);//railword india pvt ltd.


         //10. replace() Method
         String s13= s12.replace('i','o');
         System.out.println(s13);
         s13= s12.replace("india","bharat");
         System.out.println(s13);



         //11. equalsIgnoreCase() Method
         String s14= "java";
         String s15= "JAVA";
         System.out.println(s14.equalsIgnoreCase(s15));//true bcz this method ignore the case


         
         //12. split() method
         String s16="hello good morning everyone";
         String[] arr= s16.split("\\s");
         for(String ar: arr){
            System.out.println(ar);
         }

         //13.intern() Method
         String s17= "javatpoint";
         String s18= s17.intern();
         String s19= new String("javatpoint");
         String s20= s19.intern();
         System.out.println(s17==s19);//false bcz referece are different
         System.out.println(s17==s20);//true bcz intern method point the reference in scp
          
        
         //14. indexOf() Method
         String s21= "this is indexof method";
         System.out.println(s21.indexOf('m'));//16
         System.out.println(s21.indexOf("is",3));//5

         //15. lastIndexOf()method
         System.out.println(s21.lastIndexOf('s'));//6 it return last index of 


         
         //16. toLowerCase() method
           String s22="HII MY NAME IS SOURABH REWAPATI";
           System.out.println(s22.toLowerCase());
           


         //17. toUpperCase() method
         String s23= "hii my name is sourabh rewapati";
         System.out.println(s23.toUpperCase());

       
       
         //18. trim() Method
         String s24="  hi this is a trim  ";
         System.out.println(s24+" method");//without trim meyhod
         System.out.println(s24.trim()+" method");//with trim meyhod


         //19. valueOf() method
         int s25= 30;
         String s26= String.valueOf(s25);//it convert the value int to string
         System.out.println(s26);//30 is string"30";
         System.out.println(s26+10);//3010


         //20. toCharArray() method
         String s27= "sourabh";
         char ch1[]= s27.toCharArray();//conveting string to array
         System.out.println(ch1[0]);
         for(char c: ch1){
            System.out.println(c);
         }


         //21. startsWith() method
         String s28= "railworld";
         System.out.println(s28.startsWith("r"));//true
         System.out.println(s28.startsWith("a"));//false
         System.out.println(s28.startsWith("a",1));//true
 
 
 
         //22. endsWith() Method
         String s29= "this string end with railworld";
         System.out.println(s29.endsWith("d"));//true
         System.out.println(s29.endsWith("railworld"));//true
         System.out.println(s29.endsWith("with"));//false


         //23. compareTo() Method 
         String s30="hello";
         String s31="";
         String s32="hello";
         System.out.println(s30.compareTo(s31));//it return the length bcz s31 is empty string
         System.out.println(s31.compareTo(s30));//it shows negative value
         System.out.println(s32.compareTo(s30));//it shows 0 bcz both values are same

         //24. replaceAll() Method
         String  s33= "my name is sourabh";
         String s34= s33.replaceAll("\\s","");
         String s35= s33.replace("\\s","");//the main  difference of replace and replaceall method 
         System.out.println(s34);         // replace method does not remove the whitespace
         System.out.println(s35);          //replaceAll method removes the whitespaces
    }
}