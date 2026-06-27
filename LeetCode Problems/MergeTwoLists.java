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

public class MergeTwoLists{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the list 1 : ");
    int n1 = sc.nextInt();
    System.out.println("Enter the values of the list 1 : ");
    ListNode l1 = createList(sc,n1);

    System.out.print("Enter the size of the list 2 : ");
    int n2 = sc.nextInt();
    System.out.println("Enter the values of the list 2 : ");
    ListNode l2 = createList(sc,n2);

    ListNode result = mergeTwoLists(l1,l2);
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
            if(head.next != null)
            System.out.print("->");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(l1 != null && l2 != null){

            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            } else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 != null) current.next = l1;
        if(l2 != null) current.next = l2;

        return dummy.next;
    }
}