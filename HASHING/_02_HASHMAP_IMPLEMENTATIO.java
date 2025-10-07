import java.util.*;

public class _02_HASHMAP_IMPLEMENTATIO {

    public static class HashMap<K, V> { // generics in java
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no.nodes in overall
        private int N;
        private LinkedList<Node> buckets[]; // size of the buckets N

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0;
            this.N = 4;
            buckets = new LinkedList[4];

            for (int i = 0; i < 4; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int hc = key.hashCode();
            return  Math.abs(hc) % N;
        }

        private int SearchLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            int di = 0;

            for (int i = 0; i < ll.size(); i++) {

                if (ll.get(i).key == key) {
                    return di;
                }

                di++;
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            N = N * 2;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.remove();
                    put(node.key, node.value);

                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = SearchLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) (n / N);

            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = SearchLL(key, bi);

            if (di != -1) {
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = SearchLL(key, bi);

            if (di != -1) {
                LinkedList<Node> ll = buckets[bi];
                Node node = ll.remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = SearchLL(key, bi);

            if (di != -1) {
                LinkedList<Node> ll = buckets[bi];
                Node node = ll.get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    keys.add(ll.get(j).key);
                }
            }

            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 2);
        hm.put("china", 2);
        hm.put("england", 2);
        hm.put("america", 2);

        ArrayList<String> Keys = hm.keySet();

        for(int i=0 ; i<Keys.size(); i++){
            System.out.println(Keys.get(i));
        }
    }
}
