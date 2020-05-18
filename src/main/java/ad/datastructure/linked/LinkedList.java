package ad.datastructure.linked;

public interface LinkedList<T> extends Iterable<T>{
    int append(T data);

    int insert(int index, T data);

    int removeWithIndex(int index);

    T get(int index);

    int size();
}
