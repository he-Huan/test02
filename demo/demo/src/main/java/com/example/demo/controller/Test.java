package com.example.demo.controller;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    static String s,s2;
    public static void main(String[] args) {
        s = "1";
        s2 = "2";
        System.out.println(Math.floor(2.6));
    }

    class LRUCache<K, V> extends LinkedHashMap<K, V> {

        private final int CACHE_SIZE;

        // 这里就是传递进来最多能缓存多少数据
        public LRUCache(int cacheSize) {
            super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true); // 这块就是设置一个hashmap的初始大小，同时最后一个true指的是让linkedhashmap按照访问顺序来进行排序，最近访问的放在头，最老访问的就在尾
            CACHE_SIZE = cacheSize;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > CACHE_SIZE; // 这个意思就是说当map中的数据量大于指定的缓存个数的时候，就自动删除最老的数据
        }
    }
}
