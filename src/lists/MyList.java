package lists;

import java.util.Arrays;

public class MyList<E> {
    public int size;
    public int CAP = 10;
    public Object els[];

    public MyList() {
        els = new Object[CAP];
    }

    public void add(Object item) {
        sizeCheck();
        els[size++] = item;
    }

    public Object get(int i) {

        return els[i];
    }

    public void remove(int i) {
        if (i > els.length)
            throw new IndexOutOfBoundsException();
        else
            for (int j = 0; j < els.length; j++) {
                if (j != i)
                    els[i] = els[j];
            }

    }

    public void sizeCheck() {
        int size = els.length - 1;
        if (size == CAP) {
            size *= 2;
            els = Arrays.copyOf(els, size);
        }
    }

}
