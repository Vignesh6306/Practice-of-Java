import java.util.*;

public class ReverseNodeInK{

    static class ListNode{
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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the List size : ");
        int n = sc.nextInt();

        System.out.println("Enter the node values : ");
        ListNode head = createList(sc,n);

        System.out.print("Enter the reverse size : ");
        int k = sc.nextInt();

        ListNode result = ReverseNode(head, k);
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
            if(head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode ReverseNode(ListNode head, int k){
        ListNode current = head;
        int count = 0;

        while(current != null && count < k){
            current = current.next;
            count++;
        }

        if(count < k)
            return head;

        ListNode first = null;
        ListNode second = head;
        ListNode next = null;

        for(int i=0; i<k; i++){
            
            next = second.next;
            second.next = first;
            first = second;
            second = next;
        }
        head.next = ReverseNode(second,k);

        return first;
    }
}