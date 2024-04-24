package MyClasses.MyArrayList;

import MyInterfaces.MyList;
import Exceptions.MyIndexOutOfBoundsException;
import java.util.Iterator;

public class
MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;
    private final int DEFAULT_SIZE = 10;

        public MyArrayList(){
            arr = (T[]) new Object[DEFAULT_SIZE];
            size = 0;
        }
    @Override
    public void add(T item) {
        size();
        arr[size++] = item;
    }

    @Override
    public void set(int index, T item) {
        checkSize();
        checkIndex(index);
        arr[index] = item;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getFirst() {
        return null;
    }

    @Override
    public T getLast() {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int index0f(Object object) {
        return 0;
    }

    @Override
    public int lastIndex0f(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
    private void checkSize(){
        if(size == arr.length) increaseBuffer();
    }
    protected void checkIndex(int index) {
        if(index < 0 || index >= size) throw new MyIndexOutOfBoundsException(index);
    }
    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }
}
