package ru.spb.reshenie.javatasks.collectionstests;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import ru.spb.reshenie.javatasks.collections.BinTree;
import ru.spb.reshenie.javatasks.collections.BinTreeNode;

public class BinTreeTest {
    @Test
    public void testBinTree() {
        BinTree<String> tree = new BinTree<>();
        tree.root = new BinTreeNode<>("root");
        tree.root.left = new BinTreeNode<>("left");
        tree.root.right = new BinTreeNode<>("right");

        StringBuilder result = new StringBuilder();
        tree.visit(s -> result.append(s).append(" "));
        assertEquals("left root right ", result.toString());

        BinTreeNode<String> foundNode = tree.find("left");
        assertEquals("left", foundNode.value);

        tree.filter(s -> s.startsWith("r"));
        result.setLength(0);
        tree.visit(s -> result.append(s).append(" "));
        assertEquals("root right ", result.toString());
    }
}