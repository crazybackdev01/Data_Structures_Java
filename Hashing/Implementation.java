package Hashing;

import java.util.LinkedList;

public class Implementation {
    static class OwnHashMap<K, V> {
        // SEPERATE CHAINING IMPLEMENTATION

        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.4f;
        private int n; // number of entries in the map
        private LinkedList<Node>[] buckets;

        public OwnHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunc(K key) {
            int index = key.hashCode();
            return (Math.abs(index) % buckets.length);
        }

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        // Traverses the LinkedList, searches the node with the given key and returns
        // the corresponding node index in the list if key exists otherwise returns 1
        private int searchInBucket(LinkedList<Node> list, K key) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = hashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int elementIndex = searchInBucket(currentBucket, key);
            if (elementIndex == -1) {
                // Insert the new Node in the given bucket linked list
                Node newNode = new Node(key, value);
                currentBucket.add(newNode);
                n++;
            } else {
                Node currNode = currentBucket.get(elementIndex);
                currNode.value = value;
            }
        }

        public int size() {
            return n;
        }

        public V get(K key) {
            int bucketIndex = hashFunc(key);
            LinkedList<Node> list = buckets[bucketIndex];
            int elementIndex = searchInBucket(list, key);
            if (elementIndex == -1) {
                return null;
            }
            return list.get(elementIndex).value;

        }

        public V remove(K key) {
            int bucketIndex = hashFunc(key);
            LinkedList<Node> list = buckets[bucketIndex];
            int elementIndex = searchInBucket(list, key);
            if (elementIndex == -1) {
                return null;
            }
            V deletedValue = list.get(elementIndex).value;
            list.remove(elementIndex);
            n--;
            return deletedValue;
        }
    }

    public static void main(String[] args) {
        OwnHashMap<String, Integer> map = new OwnHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);

        System.out.println("Testing size: " + map.size());
        System.out.println("a key: " + map.get("a"));
    }
}
