import java.util.*;

class FindIndexOfTheFirstOccurence{

    public static int FirstOccurence(String a, String b){

        int n = a.length();
        int m = b.length();

        for(int i=0; i <= n-m; i++){

            int j;
            for(j=0; j<m; j++){
                if(a.charAt(i+j) != b.charAt(j))
                break;
                }
                
                if(j == m)
                    return i;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the sequence : ");
        String a = s.nextLine();

        System.out.print("Enter the target : ");
        String b = s.nextLine();

        int result = FirstOccurence(a,b);
        System.out.print(result);
    }
}