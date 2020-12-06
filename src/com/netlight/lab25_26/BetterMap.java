package com.netlight.lab25_26;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BetterMap<K, V> implements IBetterMap<K, V>, Iterable<V> {
    private final int size = 128;
    private final LinkedList<Node<K, V>>[] linkmap = new LinkedList[128];
    private final ArrayList<V> arr = new ArrayList<>();

    @Override
    public void add(K k, V v) {
        Node<K, V> node = new Node<>(k, v);
        int i = hashCode(k);

        if (linkmap[i] == null)
            linkmap[i] = new LinkedList<>();

        linkmap[i].add(node);
        arr.add(v);
    }

    @Override
    public V get(K k) {
        int i = hashCode(k);
        if (linkmap[i] != null) {
            for (Node<K, V> node : linkmap[i]) {
                if (node.getKey().equals(k))
                    return node.getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K k) {
        int i = hashCode(k);
        V v;

        if (linkmap[i] != null) {
            Node<K, V>[] nodes = linkmap[i].toArray(new Node[linkmap[i].size()]);

            for (int n = 0; n < nodes.length; n++) {
                if (nodes[n].getKey().equals(k)) {
                    v = nodes[n].getValue();
                    arr.remove(linkmap[i].get(n).getValue());
                    linkmap[i].remove(n);
                    return v;
                }
            }
        }
        return null;
    }

    @Override
    public Iterator<V> iterator() {
        return new NewIterator(this);
    }

    private int hashCode(K k) {
        return k.hashCode() % size;
    }

    private class Node<K, V> {
        private final K k;
        private final V v;

        public Node(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }

        @Override
        public String toString() {
            return "{" + k +
                    "=" + v +
                    "}";
        }
    }

    private class NewIterator implements Iterator<V> {
        private int currI = 0;

        public NewIterator(BetterMap<K, V> bm) {
        }

        @Override
        public boolean hasNext() {
            return currI < arr.toArray().length;
        }

        @Override
        public V next() {
            return arr.get(currI++);
        }
    }
}
