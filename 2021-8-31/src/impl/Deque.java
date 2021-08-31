package impl;

import java.util.NoSuchElementException;

public interface Deque extends Queue{

    boolean offerFirst(Integer e);
    Integer peekFirst();
    Integer pollFirst();

    boolean offerLast(Integer e);
    Integer peekLast();
    Integer pollLast();

    default void addFirst(Integer e){
        if(offerFirst(e) == false){
            throw new IllegalStateException();
        }
    }

    default Integer getFirst(){
        Integer e = peekFirst();
        if(e == null){
            throw new NoSuchElementException();
        }
        return e;
    }


    default Integer removeFirst(){
        Integer e = pollFirst();
        if(e == null){
            throw new NoSuchElementException();
        }
        return e;

    }


    default void addLast(Integer e){
        if(offerLast(e) == false){
            throw new IllegalStateException();
        }
    }

    default Integer getLast(){
        Integer e = peekLast();
        if(e == null){
            throw new NoSuchElementException();
        }
        return e;
    }


    default Integer removeLast(){
        Integer e = pollLast();
        if(e == null){
            throw new NoSuchElementException();
        }
        return e;

    }

    default boolean offer(Integer e){
        return offerLast(e);
    }
    default Integer peek(){
        return peekFirst();
    }
    default Integer poll(){
        return pollFirst();
    }

}
