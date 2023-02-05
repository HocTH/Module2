package exercise1;

import javax.management.remote.rmi._RMIConnection_Stub;
import java.util.Arrays;

public class MyList <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(int minCapacity){
        if (minCapacity > 0) {
            int newSize = this.elements.length + minCapacity;
            this.elements = Arrays.copyOf(this.elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacitty: " + minCapacity);
        }
    }

    public void add(E e){
        if(size == elements.length){
            ensureCapacity(10);
        }
        elements[size++] = e;
    }
    public void add(int index, E e){
        if (index >= 0 &&  index <= this.elements.length){
            if (this.size == this.elements.length){
                this.ensureCapacity(10);
            }
            if (this.elements[index]==null){
                this.elements[index] = e;
                ++this.size;
            }
        }
    }
    public Object get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index" + i + ",Size" + i);
        }
        return  elements[i];
    }
    public Object remove(int index) {
        if (index >= 0 && index < this.size) {
            Object temp;
            if (index == this.size - 1) {
                temp = this.elements[index];
                this.elements[index] = null;
                --this.size;
                return temp;
            } else {
                temp = this.elements[index];

                for(int i = index; i < this.size - 1; ++i) {
                    this.elements[i] = this.elements[i + 1];
                }

                this.elements[this.size - 1] = null;
                --this.size;
                return temp;
            }
        } else {
            throw new IllegalArgumentException("Index: " + index);
        }
    }
    public int size(){
        return this.size;
    }
    public boolean contains(Object o){
        for (int i = 0; i < this.size ; i++) {
            if(this.elements[i] == o){
                return true;
            }
        }
        return false;
    }
    public int indexOf( Object o){
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i]== o){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        for (int i = 0; i <this.size ; i++) {
            this.elements[i]=null;
        }
        this.size =0;
    }
    public MyList<E> clone() {
        MyList<E> v = new MyList();
        v.elements = Arrays.copyOf(this.elements, this.size);
        v.size = this.size;
        return v;
    }
}