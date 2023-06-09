package ThucHanh;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int default_capacity = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[default_capacity];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public Object get(int i) {
        if (i >= size || i < 0) {
        }
        return (E) elements[i];
    }
}
