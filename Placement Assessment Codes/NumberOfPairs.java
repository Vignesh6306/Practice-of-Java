import java.util.*;

class NumberOfPairs{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        int sub = 0;
        for(int i=0; i<arr.length; i++){
            sub -= arr[i];

            int target = s.nextInt();

            if(target == sub)
                System.out.print(target);
        }
    }
}