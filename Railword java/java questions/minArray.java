import java.util.Scanner;

class minArray{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int r= sc.nextInt();
        int minarr[]= new int[r];
        System.out.println("Enter elements of array");
        for(int i=0;i<minarr.length;i++){
            minarr[i]= sc.nextInt();
        }
         
        int newarr= minarr[0];
        System.out.println("Minimum element of array is :-");
        for(int i=0 ; i<minarr.length; i++){
             if(minarr[i]< newarr ){
                newarr= minarr[i];
             }
            }
            System.out.println(newarr);
        }
        }
    
