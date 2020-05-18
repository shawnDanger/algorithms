package ad.datastructure.linked;

import java.util.Iterator;

public class SinglyLinkedList<T> implements LinkedList<T> {

    SinglyLinkedListNode<T> header;
    SinglyLinkedListNode<T> footer;
    int lastIndex;

    @Override
    public int append(T data) {
        if (footer==null) init(data);
        else {
            appendFooter(data);
            lastIndex++;
        }
        return 1;
    }

    protected void appendFooter(T data) {
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(data, null);
        footer.next = node;
        footer = node;
    }

    void init(T data) {
        SinglyLinkedListNode<T> node = new SinglyLinkedListNode<>(data, null);
        header = node;
        footer = node;
    }
    @Override
    public int insert(int index, T data) {
        if(index>lastIndex+1) return -1;
        else if(index==lastIndex+1) appendFooter(data);
        else if(index==0) {
            if (header == null) {
                init(data);
            } else {
                header = new SinglyLinkedListNode<>(data,header);
            }
        }else {
            SinglyLinkedListNode<T> previousNode = getNode(index - 1);
            SinglyLinkedListNode<T> oldNodeWithIndex = previousNode.next;
            previousNode.next= new SinglyLinkedListNode<>(data, oldNodeWithIndex);
        }
        lastIndex++;
        return 1;
    }

    @Override
    public int removeWithIndex(int index) {
        return 1;
    }

    @Override
    public T get(int index) {
        return null;
    }

    //todo 获取到index的node
    SinglyLinkedListNode<T> getNode(int index) {
        if (index == 0) return header;
        SinglyLinkedListNode<T> next = header.next;
        for (int i = 1; i <= index; i++) {
            if (next == null) break;
        }
        return next;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
