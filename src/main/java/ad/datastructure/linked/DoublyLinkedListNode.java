package ad.datastructure.linked;

/**
 * 双向链表节点
 * @param <T>
 */
public class DoublyLinkedListNode<T> {
    public T data;
    public DoublyLinkedListNode<T> next;
    public DoublyLinkedListNode<T> prev;

    public DoublyLinkedListNode() {
    }

    public DoublyLinkedListNode(T data, DoublyLinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public DoublyLinkedListNode(DoublyLinkedListNode<T> prev, T data, DoublyLinkedListNode<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
