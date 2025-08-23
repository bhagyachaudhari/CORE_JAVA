package org.example.basic;

public class MemoryDemo {

    public static void main(String args[]){
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        runtime.gc();
        System.gc();
        System.exit(1);
    }
}
