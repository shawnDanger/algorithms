package ad.datastructure.linked;

/**
 * 单向链表节点
 *
 * @param <T>
 */
public class SinglyLinkedListNode<T> {
    public T data;
    public SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode() {
    }

    public SinglyLinkedListNode(T data, SinglyLinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
