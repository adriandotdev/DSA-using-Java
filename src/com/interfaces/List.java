package com.interfaces;

public interface List<T> {

    public void Insert(T data);
    public void InsertAt(int index, T data);
    public void RemoveStart();
    public void RemoveEnd();
    public void RemoveAt(int index);
    public int Size();
}
