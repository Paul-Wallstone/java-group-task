package by.homework.maksim.lesson8;

public class GenericArrayList<E> {
    E[] data;
    private int size;

    public GenericArrayList() {
        data = (E[]) new Object[10];
        size = 0;
    }

    public boolean add(E e) {
        if (size == data.length) {
            E[] newData = (E[]) new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
        data[size++] = e;
        return true;
    }

    public boolean remove(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                System.arraycopy(data, i + 1, data, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
