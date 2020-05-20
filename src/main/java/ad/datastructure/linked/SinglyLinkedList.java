package ad.datastructure.linked;

import java.util.Iterator;

public class SinglyLinkedList<T> implements LinkedList<T> {

    SinglyLinkedListNode<T> header;
    SinglyLinkedListNode<T> footer;
    int lastIndex;

    @Override
    public int append(T data) {
        if (footer == null) init(data);
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
        if (index > lastIndex + 1 || index < 0) return -1;
        else if (index == lastIndex + 1) appendFooter(data);
        else if (index == 0) {
            if (header == null) {
                init(data);
            } else {
                header = new SinglyLinkedListNode<>(data, header);
            }
        } else {
            SinglyLinkedListNode<T> previousNode = getNode(index - 1);
            SinglyLinkedListNode<T> oldNodeWithIndex = previousNode.next;
            previousNode.next = new SinglyLinkedListNode<>(data, oldNodeWithIndex);
        }
        lastIndex++;
        return 1;
    }

    @Override
    public int removeWithIndex(int index) {
        if (index > lastIndex + 1 || index < 0) return -1;
        else if (index == 0) {
            if (header != null) {
                SinglyLinkedListNode<T> next = header.next;
                if (next != null) {
                    header.next = null;
                    header = next;
                } else {
                    header = null;
                    footer = null;
                    return 0;
                }
            } else return 0;
        } else {
            SinglyLinkedListNode<T> prev = getNode(index - 1);
            prev.next = prev.next.next;
        }
        lastIndex--;
        return 1;
    }

    @Override
    public T get(int index) {
        SinglyLinkedListNode<T> node = getNode(index);
        return node == null ? null : node.data;
    }

    /**
     * 获取到第index的node
     *
     * @param index
     * @return
     */
    SinglyLinkedListNode<T> getNode(int index) {
        if (index == 0) return header;
        SinglyLinkedListNode<T> next = header.next;
        for (int i = 1; i <= index; i++) {
            next = next.next;
            if (next == null) break;
        }
        return next;
    }

    @Override
    public int size() {
        return lastIndex + 1;
    }

    @Override
    public Iterator<T> iterator() {
        return new SinglyLinkedListIterator<>(header);
    }

    /**
     * 单链表反转
     */
    public void reverse() {
        SinglyLinkedListNode<T> node = header;
        SinglyLinkedListNode<T> prev = null;
        footer = header;
        while (node != null) {
            SinglyLinkedListNode<T> next = node.next;
            if (next == null) header = node;
            node.next = prev;
            prev = node;
            node = next;
        }
    }

    /**
     * 单链表反转 递归版1
     */
    public void reverseRecursion() {
        footer = header;
        reverseRecursion(header);
        //去除footer死循环
        footer.next=null;
    }
    /**
     * 单链表反转 递归版2
     *
     * @param node 反转后临时头节点
     */
    public SinglyLinkedListNode<T> reverseRecursion(SinglyLinkedListNode<T> node) {
        if (node.next == null) {
            header = node;
            return node;
        }
        SinglyLinkedListNode<T> currNext = reverseRecursion(node.next);
        node.next.next = node;
        return currNext;
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> strings = new SinglyLinkedList<>();
        strings.append("1");
        strings.append("2");
        strings.append("3");
        strings.append("4");
        strings.append("5");
        for (String string : strings) {
            System.out.println("string = " + string);
        }
        strings.reverseRecursion();
//        strings.reverse();
        for (String string : strings) {
            System.out.println("string = " + string);
        }
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "header=" +header.data +
                ", footer=" + footer.data +
                '}';
    }
}