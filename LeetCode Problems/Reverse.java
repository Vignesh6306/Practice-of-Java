import java.util.*;

class Reverse{

    public static int reverse(int x){
        long result = 0;

        while(x != 0){
            int digit = x % 10;
            x /= 10;
            result = result * 10 + digit;
        }
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the values : ");
        int x = s.nextInt();

        int r = reverse(x);
        System.out.println("The reversed values : " + r);
    }
}