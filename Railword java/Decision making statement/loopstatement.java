class loopstatement{

    public static void main(String[] args){

        // for loop
        System.out.println("For loop");
        for(int i=1;i<=10;i++){
            int c= i*2;
            System.out.println(c);
        }




      //while loop
         System.out.println("\n");
         System.out.println("While loop");
         int a=10;
         while(a>0){
            System.out.println(a);
            a--;
         }



     // do while loop
         System.out.println("\n");
         System.out.println(" do While loop");
         int b=10;
         do{
            System.out.println(b);
            
         }while(b>10);

     

     // for-each loop
     System.out.println("\n");
     System.out.println("for-each loop");
     
     int arr[]={ 8,7,45,15,9 };
 
      for(int i:arr){
        System.out.println(i);
      }
      


    }
}