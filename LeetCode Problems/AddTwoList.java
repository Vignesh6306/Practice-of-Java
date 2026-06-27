import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
    
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class AddTwoList{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the list 1 : ");
    int n1 = sc.nextInt();
    
    System.out.println("Enter the values for the list 1 : ");
    ListNode l1 = createList(sc,n1);

    System.out.println("Enter the size of the list 1 : ");
    int n2 = sc.nextInt();
    
    System.out.println("Enter the values for the list 1 : ");
    ListNode l2 = createList(sc,n1);

    ListNode result = addTwoList(l1,l2);
    printList(result);
    }
    
    public static ListNode createList(Scanner sc, int n){

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(int i=0; i<n; i++){
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head){
        
        while(head != null){
            System.out.print(head.val);
            if(head.next != null) System.out.print("->");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode addTwoList(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum%10);
            current = current.next;
        }
        return dummy.next;
    }
}

