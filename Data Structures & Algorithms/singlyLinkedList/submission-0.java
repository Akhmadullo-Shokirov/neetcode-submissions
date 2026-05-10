class LinkedList {

    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = head.next;
        while(curr != null) {
            if(i == index) {
                return curr.value;
            } 
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if(newNode.next == null) {
            tail = newNode;
        }
        
    }

    public void insertTail(int val) {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = this.head;
        while(i<index && curr != null) {
            i++;
            curr = curr.next;
        }

        if(curr != null && curr.next != null) {
            if(curr.next == tail) {
                tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ListNode curr = this.head.next;
        ArrayList<Integer> values = new ArrayList();
        while(curr != null) {
            values.add(curr.value);
            curr = curr.next;
        }
        return values;
    }
}

class ListNode {
    int value;
    ListNode next;

    public ListNode(int val) {
        this.value = val;
        this.next = null;
    }
}
