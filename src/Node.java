public class Node {

    private String key;
    private String val;
    private int prev;
    private int next;

    public Node(String key, String val){
        this.key = key;
        this.val = val;
        prev = BinaryTreeMap.NULL_INDEX;
        next = BinaryTreeMap.NULL_INDEX;
    }

    public int getNext() {
        return next;
    }

    public int getPrev() {
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

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
