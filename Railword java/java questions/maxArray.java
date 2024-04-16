import java.util.Scanner;

class maxArray{
     public static void main(String[] args){

        System.out.println("Enter the size of array");
        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int arr[]= new int[r];
        System.out.println("Enter Elements of array");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int newarr= arr[0];
        System.out.println("Max value of array is :-");
          for(int i=0; i<arr.length;i++){
            if(arr[i]>newarr){
                newarr= arr[i];
            }
          }
          System.out.println(newarr);
     }
}