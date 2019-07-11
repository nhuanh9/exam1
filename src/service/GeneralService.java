package service;

public interface GeneralService<T> {
    T[] showList();

    int size();

    void add(int index, T element);

    T remove(int index);

    T set(int index, T element);

    int find(String elementName);
    void sort();
}