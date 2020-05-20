package ad.datastructure.linked;

import java.util.Iterator;

public class DoublyLinkedListIterator<T> implements Iterator<T> {

    DoublyLinkedListNode<T> node;

    public DoublyLinkedListIterator(DoublyLinkedListNode<T> node) {
        this.node = node;
    }

    @Override
    public boolean hasNext() {
        return node != null;
    }

    @Override
    public T next() {
        T data = node.data;
        node = node.next;
        return data;
    }
}
