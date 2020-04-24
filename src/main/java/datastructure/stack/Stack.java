package datastructure.stack;

/**
 * @author Deng
 * @date 2020/4/24
 */
public interface Stack<T> {
    void push(T t);

    T pop();

    T peek();
}
