import java.util.*;

public class MergekLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of list : ");
        int k = sc.nextInt();
        ListNode[] list = new ListNode[k];

        for (int i = 0; i < k; i++) {
            System.out.print("Enter the list size : ");
            int n = sc.nextInt();
            System.out.println("Enter the values of the list : ");
            list[i] = createList(sc, n);
        }

        ListNode result = mergeKLists(list);
        printList(result);
    }

    public static ListNode createList(Scanner sc, int n) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int i = 0; i < n; i++) {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode mergeKLists(ListNode[] list) {
        if (list == null || list.length == 0) return null;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        for (ListNode node : list) {
            if (node != null)
                pq.offer(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            current.next = node;
            current = current.next;

            if (node.next != null)
                pq.offer(node.next);
        }
        return dummy.next;
    }
}