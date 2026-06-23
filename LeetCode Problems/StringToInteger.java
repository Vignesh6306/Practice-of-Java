import java.util.*;

class StringToInteger{

    public static int Convert(String s){
        int i = 0;
        int n = s.length();

        while(i < n && s.charAt(i) == ' ')
            i++;

        if(i >= n)
            return 0;

        int sign = 1;
        
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        long result = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            result = result * 10 + (s.charAt(i) - '0');
            i++;

            if(result * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

             if(result * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int)(result * sign);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sequence : ");
        String s = sc.nextLine();

        int r = Convert(s);
        System.out.print("The converted inputs : " + r);
    }
}