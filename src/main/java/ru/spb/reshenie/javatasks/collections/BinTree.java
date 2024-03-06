package ru.spb.reshenie.javatasks.collections;
import java.util.function.*;
import java.util.*;
/*
Реализовать бинарное дерево BinTree, в листьях которого хранятся произвольные объекты, в виде коллекции с дженериком, с возможностью:
- обхода - void visit( <посетитель>)
- поиска по строковому представлению объектов в листьях - BinTreeNode find( <подстрока> ) { ... }
- фильтрации - void filter( <предикат> ) { ... }
- отслеживания изменений - addListener( <обработчик события изменения списка> ) { ... }
*/


public class BinTree<T> {
    public BinTreeNode<T> root;
    private List<Consumer<BinTree<T>>> listeners = new ArrayList<>();

    public void addListener(Consumer<BinTree<T>> listener) {
        listeners.add(listener);
    }

    public void visit(Consumer<T> visitor) {
        visitNode(root, visitor);
    }

    private void visitNode(BinTreeNode<T> node, Consumer<T> visitor) {
        if (node != null) {
            visitNode(node.left, visitor);
            visitor.accept(node.value);
            visitNode(node.right, visitor);
        }
    }

    public BinTreeNode<T> find(String substring) {
        return findNode(root, substring);
    }

    private BinTreeNode<T> findNode(BinTreeNode<T> node, String substring) {
        if (node == null) {
            return null;
        }

        if (node.value.toString().contains(substring)) {
            return node;
        }

        BinTreeNode<T> leftResult = findNode(node.left, substring);
        if (leftResult != null) {
            return leftResult;
        }

        return findNode(node.right, substring);
    }

    public void filter(Predicate<T> predicate) {
        filterNode(root, predicate);
    }

    private void filterNode(BinTreeNode<T> node, Predicate<T> predicate) {
        if (node != null) {
            filterNode(node.left, predicate);
            if (!predicate.test(node.value)) {
                removeNode(node);
            }
            filterNode(node.right, predicate);
        }
    }

    private void removeNode(BinTreeNode<T> node) {
        if (node == root) {
            root = null;
        } else {
            BinTreeNode<T> parent = findParentNode(root, node);
            if (parent != null) {
                if (parent.left == node) {
                    parent.left = null;
                } else if (parent.right == node) {
                    parent.right = null;
                }
            }
        }
        listeners.forEach(listener -> listener.accept(this));
    }

    private BinTreeNode<T> findParentNode(BinTreeNode<T> root, BinTreeNode<T> node) {
        if (root == null || root == node) {
            return null;
        }
        if (root.left == node || root.right == node) {
            return root;
        }
        BinTreeNode<T> leftResult = findParentNode(root.left, node);
        if (leftResult != null) {
            return leftResult;
        }
        return findParentNode(root.right, node);
    }
}