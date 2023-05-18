package BaiTap;

import java.util.Arrays;

public class MyList<E> {


    private int size = 0;
    private final int defaulta_Capacity = 10;
    private Object elements[];

    public MyList() {
    }

    public MyList(int capacity) {
        elements = new Object[defaulta_Capacity];
    }

    private void nhanDoiMang() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            nhanDoiMang();
        }
        if (index < 0 && index > size) {
            System.out.println("Ban Nhap Sai Index: " + index);
        } else {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remote(int index) {
        if (index < 0 && index > size) {
            System.out.println("Nhap Sai");
        } else {
            E element = (E) elements[index];
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
//                elements[size - 1] = null; khong co cung duoc
            }
            size--;
            return element;
        }
        return null;
    }

    public E get(int index) {
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
        }
        return (E) elements[index];
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }
}