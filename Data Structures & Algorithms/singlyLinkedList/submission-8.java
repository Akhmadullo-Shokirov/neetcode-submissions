class LinkedList {
    private ListNode node;
    private int size;

    class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int get(int index) {
        if(this.node == null) { return -1; }
        ListNode head = this.node;
        int count = 0;
        while(count != index && head.next != null) {
            count++;
            head = head.next;
        }

        if(count == index) {
            return head.val;
        }
        return -1;
    }

    public void insertHead(int val) {
        if(this.node == null) {
            this.node = new ListNode(val);
        } else {
            ListNode temp = this.node;
            this.node = new ListNode(val);
            this.node.next = temp;
        }
        
        this.size++;
    }

    public void insertTail(int val) {
        if(this.node == null) {
            this.node = new ListNode(val);
        } else {
            ListNode temp = this.node;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(val);
        }
        size++;
    }

    public boolean remove(int index) {
        if(index >= size) {return false;}
        int count = 0;
        ListNode head = this.node;
        ListNode previousNode = null;
        while(count != index && head != null) {
            count++;
            previousNode = head;
            head = head.next;
        }

        if(count == index) {
            if(previousNode == null) {
                if(head != null) {
                    this.node = head.next;
                } else {
                    return false;
                }
            } else {
                previousNode.next = head.next;
            }
            
            size--;
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> getValues() {
        ListNode head = this.node;
        ArrayList<Integer> values = new ArrayList();
        while(head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values;
    }
}
