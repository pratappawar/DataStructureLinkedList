package com.dataStructureLinkedList;

public class MyMapNode<K, V> implements INode<K>{

    K key;
    V value;
    MyMapNode<K, V> next;

    /**
     * parameterized constructor defined
     * @param key
     * @param value
     */
    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    /**
     * setters for key
     * @param key
     */
    @Override
    public void setKey(K key) {
        this.key = key;
    }

    /**
     * getters will return key
     * @return
     */
    @Override
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<K, V>) next;
    }

    @Override
    public INode<K> getNext() {
        return next;
    }

    /**
     * overridden method to string will return my map node
     * @return
     */
    @Override
    public String toString() {
        StringBuilder myMapNodeString = new StringBuilder();
        myMapNodeString.append("MyMapNode{" + "K=").append(key).append(" V=").append(value).append('}');
        if (next != null)
            myMapNodeString.append("->").append(next);
        return myMapNodeString.toString();
    }
}
