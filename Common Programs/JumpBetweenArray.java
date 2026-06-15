import java.util.Scanner;

class JumpBetweenArray{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int n = s.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++)
            a[i] = s.nextInt();

        System.out.print("Enter the size of the element to skip : ");
        int jumpSize = s.nextInt();

        int current = 0;
        int skip = 0;

        while(current < a.length-1){
            current = current + jumpSize + 1;
            skip ++;
        }
        System.out.print("The numbers of steps to reach the last : " + skip);
    }
}