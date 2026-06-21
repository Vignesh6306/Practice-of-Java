import java.util.*;

class LongestPalindrome{
    
    public static String longestPalindrome(String s){

        int start = 0, end = 0;

        for(int i=0; i<s.length(); i++){

            int l1 = AroundCenter(s,i,i);
            int l2 = AroundCenter(s,i,i+1);
            int l = Math.max(l1,l2);

            if(l > end-start){
                start = i - (l-1)/2;
                end = i + l/2;
            }
        }
        return s.substring(start,end+1);
    }
    private static int AroundCenter(String s, int left, int right){

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the sequence : ");
        String s = sc.nextLine();

        String result = longestPalindrome(s);
        System.out.println("The longest palindrome for the sequence : " + result);
    }
}