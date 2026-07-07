import java.util.*;

class VampireStephen{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.nextLine();

        String st = s.nextLine();
        
        int[] power = new int[n];
        int total = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            power[i] = st.charAt(i) - '0';
            total += power[i];
            max = Math.max(max, power[i]);
        }

        if(max > total - max){
            System.out.println(max);
        }
        else{
            Arrays.sort(power);
            int stephen = 0;
            for(int i = n-1; i>0; i--){
                stephen += power[i];

                if(stephen > stephen - total){
                    System.out.println(stephen);
                }
            }
        }
    }
}