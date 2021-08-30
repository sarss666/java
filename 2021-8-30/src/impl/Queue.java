package impl;

import java.util.NoSuchElementException;

public interface Queue {

    boolean offer(Integer e);//插入

    Integer peek();//看队首元素，但不删除
    Integer poll();//返回并删除队首元素
    default boolean add(Integer e){
        if(offer(e) == false){
            throw new IllegalStateException();
        }
        return true;
    }//插入
    default Integer element(){
        Integer e = peek();
        if(e == null){
            throw new NoSuchElementException();
        }
        return e;
    }//看队首元素，但不删除

    default Integer remove(){
        Integer e = poll();
        if(e == null){
            throw new NoSuchElementException();
        }
        return e;

    }//返回并删除队首元素





}
