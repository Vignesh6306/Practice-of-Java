import java.util.*;

class LongestPrefix{

    public static String Prefix(String[] s){
        
        if(s == null || s.length == 0) return "";

        String prefix = s[0];

        for(int i=1; i<s.length; i++){

            while(!s[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];

        System.out.println("Enter the Sequence : ");
        for(int i=0; i<n; i++)
            s[i] = sc.nextLine();

        String p = Prefix(s);
        System.out.println(p);
    }
}