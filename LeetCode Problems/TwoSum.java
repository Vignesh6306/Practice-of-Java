import java.util.*;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i); 
        }
        return new int[]{};
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int n = s.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++)
            nums[i] = s.nextInt();
        
        System.out.print("Enter target: ");
        int target = s.nextInt();
        
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));  
    }
}