import java.util.*;

class RemoveElementFromTheArray{

    public static int RemoveElement(int[] nums, int val){
        int k = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int n = s.nextInt();
        
        int[] nums = new int[n];

        System.out.println("Enter the values : ");
        for(int i=0; i<n; i++)
            nums[i] = s.nextInt();

        System.out.print("Enter the element to remove : ");
        int k = s.nextInt();

        int result = RemoveElement(nums,k);

        System.out.println("The array after removed element : ");

        for(int i=0; i<result; i++)
            System.out.print(nums[i] + " ");
    }
}