package com.mktsui.playground.java;

class ListNode { 
	int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LInkedListCycle {
    public static boolean hasCycle(ListNode head) {
        
        if (head == null)
            return false;
        
        ListNode a = head;
        ListNode b = head;

        
        while (b.next != null && b.next.next != null) {
        	b = b.next.next;
            a = a.next;
            if (a == b)
                return true;
        }
        
        return false;
    }
}
