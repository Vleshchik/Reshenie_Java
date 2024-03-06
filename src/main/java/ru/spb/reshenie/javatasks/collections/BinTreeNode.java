package ru.spb.reshenie.javatasks.collections;

public class BinTreeNode<T> {
    public T value;
    public BinTreeNode<T> left;
    public BinTreeNode<T> right;

    public BinTreeNode(T value) {
        this.value = value;
    }
}