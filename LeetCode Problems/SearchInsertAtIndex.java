import java.util.*;

class SearchInsertAtIndex{
    
    public static int Search(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            
            int mid = left + (right - left)/2;

            if(nums[mid] == target)
                return mid;

            else if(nums[mid] < target)
                left = mid + 1;

            else
                right = mid -1;
        }
        return left;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the element : ");
        for(int i=0; i<n; i++)
            nums[i] = s.nextInt();

        System.out.println("Enter the target : ");
        int target = s.nextInt();


        int i = Search(nums,target);
        System.out.println("The value insert at index : " + i);
    }
}