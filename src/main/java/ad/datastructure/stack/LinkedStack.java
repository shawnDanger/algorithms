package ad.datastructure.stack;


import ad.datastructure.linked.LinkedListNode;

/**
 * 使用链表实现栈
 * @param <T>
 */
public class LinkedStack<T> implements Stack<T> {

    private LinkedListNode<T> header=new LinkedListNode<>();
    @Override
    public void push(T t) {
        header = new LinkedListNode<T>(null,t, header);
    }

    @Override
    public T pop() {
        LinkedListNode<T> next = header.next;
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
