package HashMap;

    public class HashBuck2<K,V> {

        static class Node<K,V> {
            public K key;
            public V val;
            public Node<K,V> next;

            public Node( K key, V val) {
                this.key = key;
                this.val = val;
            }
        }
        public Node<K,V>[] array =
                (Node<K,V>[])new Node[10];

        public int usedSize;
        private static final double DEFAULT_LOAD_FACTOR = 0.75;

        /**
         *
         * @param key
         * @param val
         */
        public void put(K key,V val) {
            Node<K,V> node = new Node<>(key,val);
            int hash = key.hashCode();
            int index = hash % array.length;

            Node<K,V> cur = array[index];
            while (cur != null) {
                if(cur.key.equals(key)) {
                    cur.val = val;
                }
                cur = cur.next;
            }
            node.next = array[index];
            array[index] = node;
            usedSize++;
            //扩容！！
        }

        public V get(K key) {
            int hash = key.hashCode();
            int index = hash % array.length;
            Node<K,V> cur = array[index];
            while (cur != null) {
                if(cur.key.equals(key)) {
                    return cur.val ;
                }
                cur = cur.next;
            }
            return null;
        }

        public static void main(String[] args) {
//            HashBuck2<Person,String> hashBuck2 = new HashBuck2<>();
//            Person person1 = new Person("1234");
//            Person person2 = new Person("1234");
//            //1、先以person1作为key进行存储
//            hashBuck2.put(person1,"高博");
//            //2. 因为重写了person的hashcode方法，所以用过person2也可以获取到对应的key
//            System.out.println(hashBuck2.get(person2));
        }
    }

