import java.util.*;

class RemoveDuplicatesInSortedArray{

    public static int RemoveDuplicate(int[] nums){
        if(nums.length == 0) return 0;

        int j = 0;

        for(int i=1; i<nums.length; i++){

            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the values : ");
        for(int i=0; i<n; i++)
            nums[i] = sc.nextInt();

        int result = RemoveDuplicate(nums);

        System.out.print("The array after removed duplicates : ");
        for(int i = 0; i<result; i++){
            System.out.print(nums[i] + " ");
        }
    }
}