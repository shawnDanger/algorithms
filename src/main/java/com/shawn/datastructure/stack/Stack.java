package com.shawn.datastructure.stack;

/**
 * @author Deng
 * @date 2020/4/24
 */
public interface Stack<T> {
    void push(T t);

    T pop();

    /**
     * 仅用来查看下一个出栈的对象
     * @return
     */
    T peek();
}
