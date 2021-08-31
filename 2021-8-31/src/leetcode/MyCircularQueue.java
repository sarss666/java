package leetcode;

public class MyCircularQueue {

    private final int[] array;
    private int size;
    private int frontIndex;
    private int rearIndex;

    //循环队列的容量
    public MyCircularQueue(int k) {
        array = new int[k];
        size = 0;
        frontIndex = 0;
        rearIndex = 0;
    }
    //把value插入队尾
    //成功返回true,失败返回false(容量满了)
    public boolean enQueue(int value) {
       if (size == array.length){
           return false;
       }
       array[rearIndex] = value;
       size--;
       rearIndex++;
       if (rearIndex == array.length){
           rearIndex = 0;
       }
       return true;
    }
    //从循环队列队首删除一个元素
    //成功返回true,失败返回false(队列空了)
    public boolean deQueue() {
        if (size == 0){
            return false;
        }
        size--;
        frontIndex++;
        if (frontIndex == array.length){
            frontIndex = 0;
        }
        return true;
    }
    //从队首获取元素。如果队列为空，返回 -1 。
    public int Front() {
        if (size == 0){
            return -1;
        }
        return array[frontIndex];
    }
    //获取队尾元素。如果队列为空，返回 -1
    public int Rear() {
        if (size == 0){
            return -1;
        }
        int index = rearIndex - 1;
        if (index == -1){
            index = array.length - 1;
        }
        return array[index];
    }
    // 检查循环队列是否为空。
    public boolean isEmpty() {
        return size == 0;
    }
    // 检查循环队列是否已满。
    public boolean isFull() {
        return size == array.length;
    }
}
