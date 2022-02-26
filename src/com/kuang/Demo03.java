package com.kuang;

import java.util.ArrayList;

// Dump 指令：-Xms1m -Xmx8m -XX: +HeapDumpOnOutOfMemoryError
// -Xms：设置初始化内存分配大小 1/64
// -Xmx：设置最大分配内存 1/4
// -XX:+HeapDumpOnOutOfMemoryError：OOM Dump
// -XX:+PrintDCDetails：打印GC垃圾回收信息
public class Demo03 {

    byte[] array = new byte[1*1024*1024];

    public static void main(String[] args) {
        ArrayList<Demo03> list = new ArrayList<>();
        int count = 0;

        try{
            while(true){
                list.add(new Demo03());
                count ++;
            }
        }catch (Error e){
            System.out.println("count: " + count);
            e.printStackTrace();
        }
    }

}
