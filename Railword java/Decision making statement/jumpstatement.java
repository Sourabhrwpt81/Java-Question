class jumpstatement{
    public static void main(String[] args){
         
        // Break statement
        System.out.println("Break statement");

        for(int i=1; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }


        
        // continue statement
        System.out.println("\n");
        System.out.println("continue statement");

        for(int i=1; i<=10; i++){
            if(i==5){
                System.out.println("--");
                continue;
               
            }
            System.out.println(i);
        }
    }
}