import java.util.Scanner;

class vowels{

    public static void main(String[] args){
        String name= "sourabh";

        for(int i=0;i<name.length();i++){
            char c= name.charAt(i);
            if(c =='a'|| c == 'e' || c =='i' ||c =='o' || c =='u'){
                System.out.print(c+" ");
            }
        }
        
    }
}