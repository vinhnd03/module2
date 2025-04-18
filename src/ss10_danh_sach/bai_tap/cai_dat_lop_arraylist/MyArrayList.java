package ss10_danh_sach.bai_tap.cai_dat_lop_arraylist;

import java.util.Arrays;

public class MyArrayList<E> {
    //số lượng phần tử có trong MyArrayList
    private int size = 0;
    //Sức chứa mặc định
    private static final int DEFAULT_CAPACITY = 10;

    //Mảng chứa các phần tử
    Object elements[];

    //Sức chứa mặc đi khi tạo bằng constructor ko tham số
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //truyền tham số là sứa chứa
    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //Phương thức trả về số lượng
    public int size() {
        return this.size;
    }

    //Phương thức clear 1 arrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //Phương thức add 1 phần tử vào ArrayList
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //Phương thức tăng kích thước của ArrayList
    private void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //Phương thức lấy ra một phần tử tại index
    public E get(int index) {
        return (E) elements[index];
    }

    //Phương thức trả về vị trí của phần tử
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    //Phương thức kiểm tra 1 phần tử có tồn tại
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }

    //Tạo bản sao của 1 ArrayList hiện tại
    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements, size);
        v.size = this.size;
        return v;
    }

    //Phương thức xóa 1 phần từ tại index
    public E remove(int index){
        if(index < 0 || index > elements.length){
            throw new IllegalArgumentException("Error index: " + index);
        }
        E element = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return element;
    }
}
