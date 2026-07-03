import java.util.*;

class SumAllTheValueInArray{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the size : ");
        int n = s.nextInt();

        System.out.println("Enter the elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        int sum = 0;

        for(int i=0; i<arr.length;  i++)
            sum = sum + arr[i];

        System.out.print("The sum of all inputs : " + sum);
    }
}