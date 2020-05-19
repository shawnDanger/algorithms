package ad.datastructure.linked;

import java.util.Iterator;

public class SinglyLinkedListIterator<T> implements Iterator<T> {
    public SinglyLinkedListIterator(SinglyLinkedListNode<T> header) {
    }

    private SinglyLinkedListNode<T> node;

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
