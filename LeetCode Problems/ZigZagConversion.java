import java.util.*;

class ZigZagConversion{

    public static String Convert(String s, int n){

        if(n == 1) return s;

        StringBuilder[] row = new StringBuilder[n];

        for(int i=0; i<n; i++)
            row[i] = new StringBuilder();

        int r = 0;
        int direction = 1;

        for(char c : s.toCharArray()){
            row[r].append(c);
            r += direction;

            if(r == 0 || r == n-1)
                direction = -direction;
        }

            StringBuilder result = new StringBuilder();

            for(StringBuilder sb : row){
                result.append(sb);
            }
            return result.toString();
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the sequence : ");
            String s = sc.nextLine();

            System.out.print("Enter the row size : ");
            int n = sc.nextInt();

            String result = Convert(s,n);
            System.out.println("ZigZag Coversion : " + result);
        }
    }
