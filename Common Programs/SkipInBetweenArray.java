import java.util.*;

class SkipInBetweenArray{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = s.nextInt();

        System.out.println("Enter the elements : ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        System.out.print("Enter the skip size : ");
        int skip = s.nextInt();
        ArrayList<Integer> l = new ArrayList<>();

        int i = 0;
        while(i < arr.length){
            l.add(arr[i]);
            i += skip + 1;
        }
        System.out.print("After skipping the elements : " + l);
    }
}