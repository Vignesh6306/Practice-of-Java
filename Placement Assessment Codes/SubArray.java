import java.util.*;
import java.util.Scanner;

class SubArray{
    public static boolean Zero(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(arr[i] == 0 || sum == 0 || set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        System.out.print("The subset for the inputs are : " + Zero(arr));
    }
}