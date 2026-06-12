import java.util.*;

class FindMiddleIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }
        
        int leftSum = 0;
        int index = -1;
        
        for (int i = 0; i < n; i++) {
            leftSum += arr[i];  
            int rightSum = totalSum - leftSum; 
            
            if (leftSum == rightSum) {
                index = i;
                break;
            }
        }
        
        System.out.println(index);
        
        s.close();
    }
}