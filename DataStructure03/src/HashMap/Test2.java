package HashMap;

import java.util.*;

public class Test2 {

    /**
     * @Author 12629
     * @Description：
     */
    static class Person {
        public String id;

        public Person(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id='" + id + '\'' +
                    '}';
        }

        /**
         * 这个方法的作用 在HashMap当中是干嘛的？
         * @return
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(id, person.id);
        }

        /**
         * 这个方法的作用 在HashMap当中是干嘛的？
         * @return
         */
        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }


        public static void func1(int[] array) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                set.add(array[i]);
            }
            System.out.println(set);
        }

        public static void func2(int[] array) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < array.length; i++) {
                if(set.contains(array[i])) {
                    System.out.println(array[i]);
                    return;
                }
                set.add(array[i]);
            }
        }


        public static HashMap<Integer,Integer> func3(int[] array) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                if(map.get(array[i]) == null) {
                    map.put(array[i],1);
                }else {
                    int val = map.get(array[i]);
                    map.put(array[i],val+1);
                }
            }
            return map;
        }


        public static void main(String[] args) {
            int[] array = new int[10_0000];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(1_0000);
            }

            HashMap<Integer,Integer> map = func3(array);
            for(Map.Entry<Integer,Integer> entry :map.entrySet()) {
                System.out.println("key: "+entry.getKey()+" val: "+entry.getValue());
            }
        }

        public static void main2(String[] args) {
            HashMap<String,Integer> map = new HashMap<>(19);
            map.put("hello",3);
            map.put("abcd",2);
            map.put("op",1);
            System.out.println(map);
            HashSet<Integer> set = new HashSet<>();

        }
        public static void main1(String[] args) {
            Person person1 = new Person("1234");
            Person person2 = new Person("1234");
            System.out.println(person1.hashCode());
            System.out.println(person2.hashCode());

            System.out.println(person1.equals(person2));

        }
    }

