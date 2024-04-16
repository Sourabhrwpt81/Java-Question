import java.util.Scanner;

class duplicateArray{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter size of array");
        int r= s.nextInt();
        int[] arr = new int[r];

        System.out.println("Enter values of array");
        for(int i=0; i<r; i++){
            arr[i]= s.nextInt();
        }
        System.out.println("Duplicat values are :-");
        for(int i=0; i< arr.length;i++){
            for(int j= i+1; j<arr.length;j++){
                   if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                   }
            }
        }


    }
}