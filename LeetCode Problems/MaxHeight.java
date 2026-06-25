import java.util.*;

class MaxHeight{

    public static int Container(int[] height){

        int left = 0;
        int right = height.length-1;
        int maxArea = 0;

        while(left < right){
            
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();
        int[] height = new int[n];

        System.out.print("Enter the value : ");
        for(int i=0; i<n; i++)
            height[i] = s.nextInt();

        int x = Container(height);
        System.out.print("The maximum height : " + x);
    }
}