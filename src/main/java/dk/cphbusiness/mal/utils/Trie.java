package dk.cphbusiness.mal.utils;

import java.io.IOException;
import java.util.*;

public class Trie {
    private Node rootNode;

    /*to make new trie*/
    Trie()
    {
        rootNode = null;
    }

    // function to insert
    // a string in trie
    void insert(String key, int index)
    {
        // making a new path
        // if not already
        if (rootNode == null)
        {
            rootNode = new Node();
        }

        Node currentNode = rootNode;

        for (int i = 0;i < key.length();i++)
        {
            char keyChar = key.charAt(i);

            if (currentNode.getChild(keyChar) == null)
            {
                currentNode.addChild(keyChar);
            }

            // go to next node
            currentNode = currentNode.getChild(keyChar);
        }

        // Mark leaf (end of string)
        // and store index of 'str'
        // in index[]
        currentNode.addIndex(index);
    }

    void traversePreorder(String[] array)
    {
        traversePreorder(rootNode, array);
    }

    // function for preorder
    // traversal of trie
    private void traversePreorder(Node node,
                                  String[] array)
    {
        if (node == null)
        {
            return;
        }

        if (node.getIndices().size() > 0)
        {
            for (int index : node.getIndices())
            {
                System.out.print(array[index] + " ");
            }
        }

        for (char index = 'a';index <= 'z';index++)
        {
            traversePreorder(node.getChild(index), array);
        }
    }

    private static class Node {

        private Node[] children;
        private List<Integer> indices;

        Node()
        {
            children = new Node[26];
            indices = new ArrayList<>(0);
        }

        Node getChild(char index)
        {
            if (index < 'a' || index > 'z')
            {
                return null;
            }

            return children[index - 'a'];
        }

        void addChild(char index)
        {
            if (index < 'a' || index > 'z')
            {
                return;
            }

            Node node = new Node();
            children[index - 'a'] = node;
        }

        List<Integer> getIndices()
        {
            return indices;
        }

        void addIndex(int index)
        {
            indices.add(index);
        }
    }
}

class SortStrings {

    // Driver program
    public static void main(String[] args) throws IOException {
        Trie trie = new Trie();

        String[] str = FileUtility.toStringArray("D:\\java projects\\soft2021spring-mal\\data\\" +
                "king-james-bible.txt", "[^A-Za-z']+");
        //"shakespeare-complete-works.txt", "[^A-Za-z']+");

        String[] array = { "abc", "xyz",
                "abcd", "bcd", "abc" };

        for (int i = 0;i < str.length;i++)
        {
            trie.insert(str[i], i);
        }
        trie.traversePreorder(str);
        printInSortedOrder(str);
        System.out.println("\nSorted array");
        for (int i = 0; i < str.length; ++i)
            System.out.print(str[i] + " ");

    }

    // function to sort an array
    // of strings using Trie
    private static void printInSortedOrder(String[] array)
    {
        Trie trie = new Trie();

        for (int i = 0;i < array.length;i++)
        {
            trie.insert(array[i], i);
        }

        trie.traversePreorder(array);
    }
}
