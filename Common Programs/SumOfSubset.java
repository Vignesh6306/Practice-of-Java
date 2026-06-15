import java.util.Scanner;

class SumOfSubset{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        System.out.print("Enter the starting position : ");
        int start = s.nextInt();

        System.out.print("Enter the ending position : ");
        int end = s.nextInt();

        int sum = 0;

        for(int i = start; i <= end; i++){
            sum = sum + arr[i];
        }
        
        System.out.print("The Result before sum : " + sum);
    }
}