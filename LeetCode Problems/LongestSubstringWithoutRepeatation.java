import java.util.*;

class LongestSubstringWithoutRepeatation{

    public static int LongestSubstring(String s){
        Set<Character> set = new HashSet<>();

        int left = 0, maxLength = 0;

        for(int right = 0; right < s.length(); right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sequence : ");
        String s = sc.nextLine();

        int repeat = LongestSubstring(s);
        System.out.println("The length of the sequence without repeatation : " + repeat);

    }
}