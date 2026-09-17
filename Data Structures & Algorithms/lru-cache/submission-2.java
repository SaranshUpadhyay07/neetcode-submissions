class LRUCache {
    
    static int capacity,length;
    static HashMap<Integer,Node> map;
    static Node head,tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = tail = null;
        length = 0;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        
        Node curr = map.get(key);

        if(head == curr) return head.val;

        if(curr == tail){
            tail = tail.prev;
            tail.next = null;
        }else{
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }

        curr.next = head;
        head.prev = curr;
        curr.prev = null;
        head = curr;

        return head.val;
    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            map.get(key).val = value;
            get(key);
            return ;
        }

        if(length < capacity){
            Node newNode = new Node(key,value);

            if(head == null) head = tail = newNode;
            else{
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }

            length ++;
            map.put(key,newNode);
            return ; 
        }

        map.remove(tail.key);

        Node newNode = new Node(key,value);

        if(head == tail) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }

        if(head == null) tail = head = newNode;
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        map.put(key,newNode);
        return ;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */

 class Node{
    int val,key;
    Node next,prev;

    Node(int key, int val){
        this.val = val;
        this.key = key;
    }
 }