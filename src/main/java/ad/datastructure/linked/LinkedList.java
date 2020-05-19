package ad.datastructure.linked;

public interface LinkedList<T> extends Iterable<T> {
    /**
     * 在末尾追加数据
     *
     * @param data
     * @return
     */
    int append(T data);

    /**
     * 在末尾之前插入数据
     *
     * @param index
     * @param data
     * @return
     */
    int insert(int index, T data);

    /**
     * 移除index的数据
     *
     * @param index
     * @return
     */
    int removeWithIndex(int index);

    /**
     * 获取到index的数据
     *
     * @param index
     * @return
     */
    T get(int index);

    /**
     * 链表长度
     *
     * @return
     */
    int size();
}
