class LRUCache {
    int cap;
    ListNode head;
    int size;
    ListNode tail;
    

    public LRUCache(int capacity) {
        this.cap = capacity;
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int key) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null && curr.key != key){
            prev = curr;
            curr = curr.next;
        }
        if(curr == null) return -1;


        if(curr != head){
            prev.next = curr.next;
            if(prev.next == null) tail = prev;
            curr.next = head;
            head = curr;
        }
        return head.val;
    }
    
    public void put(int key, int value) {
        boolean notThere = true;
        ListNode prev = null;

        ListNode curr = head;
        while(curr != null){
            if(curr.key == key){
                notThere = false;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if(!notThere){
            if(curr != head){
                prev.next = curr.next;
                if(prev.next == null) tail = prev;
                curr.next = head;
                head = curr;
            }
            head.val = value;
        }
        else{
            ListNode w = new ListNode(key,value);
            w.next = head;
            head = w;
            if(tail == null) tail = w;
            size++;
            if(size > cap){
                ListNode i = head;
                while(i.next != tail) i = i.next;
                i.next = null;
                tail = i;
                size--;
            }
        }

    }
}
class ListNode{
    int val;
    int key;
    ListNode next ;

    public ListNode( int key,int val){
        this.val = val;
        this.key = key;
    }
}
