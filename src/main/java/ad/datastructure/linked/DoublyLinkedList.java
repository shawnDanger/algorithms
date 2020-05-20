package ad.datastructure.linked;

import java.util.Iterator;

/**
 * 双向链表
 * @param <T>
 */
public class DoublyLinkedList<T> implements LinkedList<T>{

    protected DoublyLinkedListNode<T> header;

    protected DoublyLinkedListNode<T> footer;

    protected int lastIndex;

    @Override
    public int append(T data) {
        if (footer == null) {
            init(data);
        } else {
            appendWithFooter(data);
            lastIndex++;
        }
        return 1;
    }
    protected void init(T data) {
        DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(null, data, null);
        header = node;
        footer = node;
    }

    protected void appendWithFooter(T data) {
        DoublyLinkedListNode<T> node = new DoublyLinkedListNode<>(null,data, footer);
        footer.next=node;
        footer = node;
    }
    @Override
    public int insert(int index, T data) {
        return 0;
    }

    @Override
    public int removeWithIndex(int index) {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }

    //todo 双链表反转
    public void reverse(){

    }
    @Override
    public int size() {
        return lastIndex+1;
    }

    @Override
    public Iterator<T> iterator() {
        return new DoublyLinkedListIterator<>(header);
    }
}
