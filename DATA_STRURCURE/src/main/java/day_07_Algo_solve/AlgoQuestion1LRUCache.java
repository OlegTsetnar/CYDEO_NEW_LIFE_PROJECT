package day_07_Algo_solve;

public class AlgoQuestion1LRUCache {
    public static void main(String[] args) {
        Array_LRU_Cache lru=new Array_LRU_Cache(3);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        System.out.println(lru.get(1));// Access , makes (1,1) most recently used
        lru.put(4, 4); // Cache ={ (4,4), (1,1), (3,3)}
        System.out.println(lru.get(2)); // return -1;
    }
}