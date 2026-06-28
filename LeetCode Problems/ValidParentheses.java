import java.util.*;

class ValidParentheses{

    public static boolean vaild(String s){

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){

            if(c == '(' || c == '{' || c == '[')
                st.push(c);

            else{
                if(st.isEmpty()) return false;

                char top = st.pop();
                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sequence : ");
        String s = sc.nextLine();

        boolean result = vaild(s);
        System.out.println(result);
    }
}