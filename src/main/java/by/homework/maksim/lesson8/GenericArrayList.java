package by.homework.maksim.lesson8;

public class GenericArrayList<E> {
    private final E[] data;
    private int size;
    private int lastFilledIndex = -1;

    public GenericArrayList(int size) {
        this.data = (E[]) new Object[size];
        this.size = size;
    }

    public GenericArrayList() {
       this(10);
    }

    public boolean add(E e) {
        if (lastFilledIndex < size) {
            data[++lastFilledIndex] = e;
            return true;
        }
        return false;
    }

    public boolean remove(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                data[i] = null;
                return true;
            }
        }
        return false;
    }

    public E get(int i) {
        if (i >= 0 && i < size) {
            return data[i];
        }
        return null;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i] != null && data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        for (int i = 0; i < size; i++) {
            if (data[i] != null) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return size;
    }
}
