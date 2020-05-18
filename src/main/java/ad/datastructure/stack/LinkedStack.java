package ad.datastructure.stack;


import ad.datastructure.linked.SinglyLinkedListNode;

/**
 * 使用链表实现栈
 * @param <T>
 */
public class LinkedStack<T> implements Stack<T> {

    private SinglyLinkedListNode<T> header=new SinglyLinkedListNode<>();
    @Override
    public void push(T t) {
        header = new SinglyLinkedListNode<T>(t, header);
    }

    @Override
    public T pop() {
        SinglyLinkedListNode<T> next = header.next;
        if (next == null) return null;
        T data = header.data;
        header.next=null;
        header = next;
        return data;
    }

    @Override
    public T peek() {
        return header.next == null ? null : header.data;
    }
}
