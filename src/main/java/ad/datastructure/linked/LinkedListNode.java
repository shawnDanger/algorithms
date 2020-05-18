package ad.datastructure.linked;


public class LinkedListNode<T> {
    public T data;
    public LinkedListNode<T> next;
    public LinkedListNode<T> prev;

    public LinkedListNode() {
    }

    public LinkedListNode(LinkedListNode<T> prev, T data, LinkedListNode<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
