package ad.datastructure.stack;


import ad.datastructure.linked.Node;

/**
 * 使用链表实现栈
 * @param <T>
 */
public class LinkedStack<T> implements Stack<T> {

    private Node<T> header=new Node<>();
    @Override
    public void push(T t) {
        header = new Node<>(t, header);
    }

    @Override
    public T pop() {
        Node<T> next = header.getNext();
        if (next == null) return null;
        T data = header.getData();
        header.setNext(null);
        header = next;
        return data;
    }

    @Override
    public T peek() {
        return header.getNext() == null ? null : header.getData();
    }
}
