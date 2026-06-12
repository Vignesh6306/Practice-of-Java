import java.util.Scanner;

class MissingNumbers{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = s.nextInt();

        int min = arr[0];
        int max = arr[n-1];
        int index = 0;

        for(int num = min; num <= max; num++){
            if(index < n && arr[index] == num){
                index++;
            } else{
                System.out.print(num + " ");
            }
        }
    }
}