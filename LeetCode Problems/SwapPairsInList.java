import java.util.*;

public class SwapPairsInList{

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

        System.out.print("Enter the size of the list : ");
        int n = sc.nextInt();
       
        System.out.println("Enter the values of the list : ");
        ListNode head = createList(sc,n);
        System.out.println("Enter the values of the list : ");

        ListNode result = SwapPairs(head);
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

    public static ListNode SwapPairs(ListNode head){

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while(current.next != null && current.next.next != null){

            ListNode first = current.next;
            ListNode second = current.next.next;

            first.next = second.next;
            second.next = first;
            current.next = second;

            current = first;
        }
        return dummy.next;
    }
}