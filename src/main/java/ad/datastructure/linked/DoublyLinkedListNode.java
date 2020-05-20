package ad.datastructure.linked;

/**
 * 双向链表节点
 * @param <T>
 */
public class DoublyLinkedListNode<T> {
    public DoublyLinkedListNode<T> next;
    public T data;
    public DoublyLinkedListNode<T> prev;

    public DoublyLinkedListNode() {
    }

    public DoublyLinkedListNode(DoublyLinkedListNode<T> prev, T data, DoublyLinkedListNode<T> next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
