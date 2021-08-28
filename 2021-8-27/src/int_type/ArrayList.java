package int_type;

import java.util.Arrays;

public class ArrayList implements List {
    private int[] array;
    private int size;

    public ArrayList() {

        array = new int[10];

        size = 0;
    }

    public ArrayList(List other) {

        array = new int[other.size()];
        for (int i = 0; i < other.size(); i++) {
            array[i] = other.get(i);
        }
        size = other.size();
    }

    public void  ensureCapacity(int capacity){

        if(this.array.length >= capacity){
            return;
        }
        // 定义新的数组
        int[] newArray = new  int[capacity];
        //从array数组搬到newArray数组中

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        //不在关联旧的array，关联新的newArray
        this.array = newArray;

    }
    @Override
    public boolean add(Integer e) {
        if(array.length == size){
            ensureCapacity(array.length*2);
        }
        array[size++] = e;

        return true;
    }

    @Override
    public void add(int index, Integer e) {
        if(array.length == size){
            ensureCapacity(array.length*2);
        }
        if(index < 0 || index > size){
            throw  new IndexOutOfBoundsException("不合法的下标"+index);
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = e;
        size++;
    }

    @Override
    public Integer remove(int index) {
        if(index < 0 || index >= size){
            throw  new IndexOutOfBoundsException("不合法的下标"+index);
        }
        int e = array[index];

        for (int i = index + 1; i <= size - 1; i++) {
            array[i - 1] = array[i];
        }
        size--;
        return e;
    }

    @Override
    public boolean remove(Integer e) {

        int index = indexOf(e);
        if (index != -1) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Integer get(int index) {
        if(index < 0 || index >= size){
            throw  new IndexOutOfBoundsException("不合法的下标"+index);
        }
        return array[index];
    }

    @Override
    public Integer set(int index, Integer e) {
        if(index < 0 || index >= size){
            throw  new IndexOutOfBoundsException("不合法的下标"+index);
        }
        Integer old = array[index];
        array[index] = e;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

        Arrays.fill(array, -1);
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Integer e) {
        return indexOf(e) != -1;
    }

    @Override
    public int indexOf(Integer e) {
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer e) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if(i != size-1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}