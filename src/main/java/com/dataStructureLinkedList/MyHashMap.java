package com.dataStructureLinkedList;

public class MyHashMap<K extends Comparable,V> {
     MyLinkedList<K> myLinkedList;

    /**
     * constructor where i declare MyLinkedList object
     */
    public MyHashMap() {
        myLinkedList = new MyLinkedList();
    }


    /**
     * get method will search particular node in MyLinkedList
     * according to search element it will give result
     * @param key
     * @return
     */
    public V get(K key) {
        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>)this.myLinkedList.searchElement(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    /**
     * Add method will add node in hashmap by searching element in LinkedList
     * and adding the element
     * @param key
     * @param value
     */
    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.searchElement(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            this.myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMap{" + "myLinkedList=" + myLinkedList + '}';
    }
}
