import java.util.*;
import java.util.Scanner;

class SeparateByBuckets{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();
        String[] basket = new String[n];

        for(int i=0; i<n; i++)
            basket[i] = s.nextLine();

        HashSet<String> set = new HashSet<>();

        set.add("Mango");
        set.add("Orange");
        set.add("Onion");
        set.add("Tomato");
        set.add("Chilli");
        set.add("Potato");
        set.add("Grapes");

        ArrayList<String> bucket1 = new ArrayList<>();
        ArrayList<String> bucket2 = new ArrayList<>();

        for(String item : basket){
            if(set.contains(item))
                bucket1.add(item);
            else
                bucket2.add(item);
        }
        
        System.out.println(bucket1);
        System.out.println(bucket2);
    }
}