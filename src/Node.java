public class Node {

    private String key;
    private String val;
    private Node prev;
    private Node next;

    public Node(String key, String val){
        this.key = key;
        this.val = val;
        prev = null;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public String getKey() {
        return key;
    }

    public String getVal() {
        return val;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
