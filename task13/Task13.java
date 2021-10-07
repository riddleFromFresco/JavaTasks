package tasks.task13;

import jdk.internal.util.ArraysSupport;

import java.util.*;
import java.util.ArrayList;

class MyCollection<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable {
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    transient Object[] elementData;

    public MyCollection(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    public MyCollection() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    E elementData(int index) {
        return (E) elementData[index];
    }

    private Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            int newCapacity = ArraysSupport.newLength(oldCapacity,
                    minCapacity - oldCapacity, /* minimum growth */
                    oldCapacity >> 1           /* preferred growth */);
            return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        }
    }

    private Object[] grow() {
        return grow(size + 1);
    }

    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length)
            elementData = grow();
        elementData[s] = e;
        size = s + 1;
    }

    public boolean add(E e) {
        modCount++;
        add(e, elementData, size);
        return true;
    }

    @Override
    public E get(int index) {
        Objects.checkIndex(index, size);
        return elementData(index);
    }

    @Override
    public int size() {
        return size;
    }

    public void clear() {
        modCount++;
        final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }

    @Override
    public String toString() {
        StringBuilder strToBuild = new StringBuilder("[");
        int currInd = 0;
        for (Object item: this.elementData) {
            if (item != null)
                strToBuild.append(String.valueOf(item));
            if (currInd < this.size() - 1)
                strToBuild.append(", ");
            currInd++;
        }
        strToBuild.append(']');

        return strToBuild.toString();
    }
}

public class Task13 {
    public static void arrayListTest() {
        Random r = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            lst.add(r.nextInt(100));

        System.out.println("Original instance of ArrayList:");
        System.out.println(lst);

        System.out.println("Instance of ArrayList after removing 1st item (with index = 0):");
        lst.remove(0);
        System.out.println(lst);

        System.out.println("Instance of ArrayList after sorting:");
        Collections.sort(lst);
        System.out.println(lst);

        System.out.println("Current size of ArrayList instance:");
        System.out.println(lst.size());

        System.out.println("1st item of ArrayList instance:");
        System.out.println(lst.get(0));

        System.out.println("Size of ArrayList instance after cleaning:");
        lst.clear();
        System.out.println(lst.size());
    }

    public static void linkedListTest() {
        Random r = new Random();
        LinkedList<Character> lst = new LinkedList<Character>();
        for (int i = 0; i < 10; i++)
            lst.add((char)r.nextInt(120));

        System.out.println("Original instance of LinkedList:");
        System.out.println(lst);

        System.out.println("Instance of LinkedList after removing 1st item (with index = 0):");
        lst.remove(0);
        System.out.println(lst);

        System.out.println("Instance of LinkedList after sorting:");
        Collections.sort(lst);
        System.out.println(lst);

        System.out.println("Current size of LinkedList instance:");
        System.out.println(lst.size());

        System.out.println("1st item of LinkedList instance:");
        System.out.println(lst.get(0));

        System.out.println("Size of LinkedList instance after cleaning:");
        lst.clear();
        System.out.println(lst.size());

    }

    public static void main(String[] args) {
        Task13.arrayListTest();
        System.out.println("\n");
        Task13.linkedListTest();
        System.out.println("\n");

        MyCollection<Integer> mc = new MyCollection<Integer>();
        mc.add(5);
        mc.add(7);
        mc.add(9);
        System.out.println(mc);
        System.out.println(mc.size());
        mc.clear();
        System.out.println(mc);
    }
}
